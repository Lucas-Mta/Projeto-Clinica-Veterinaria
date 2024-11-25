package Controller;

import Model.*;
import View.TableModels.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private static Client selectedClient = null;
    private static Animal selectedAnimal = null;
    private static Specie selectedAnimalSpecie = null;
    private static Veterinarian selectedVet = null;
    private static Treatment selectedTreatment = null;
    private static Appointment selectedAppointment = null;

    private static JTextField selectedClientTextField = null;
    private static JTextField selectedAnimalTextField = null;
    private static JTextField selectedAnimalSpecieTextField = null;

    public static void setTextFields(JTextField client, JTextField animal, JTextField animalSpecie) {
        selectedClientTextField = client;
        selectedAnimalTextField = animal;
        selectedAnimalSpecieTextField = animalSpecie;
    }

    // GETTERS
    public static Client getSelectedClient() {
        return selectedClient;
    }

    public static Animal getSelectedAnimal() {
        return selectedAnimal;
    }

    public static Veterinarian getSelectedVet() {
        return selectedVet;
    }

    public static Treatment getSelectedTreatment() {
        return selectedTreatment;
    }

    public static Appointment getSelectedAppointment() {
        return selectedAppointment;
    }


    // SETTER
    public static void setSelected(Object selected) {
        if (selected instanceof Client) {
            selectedClient = (Client) selected;
            selectedClientTextField.setText(selectedClient.getName());
            selectedAnimal = null;
            selectedAnimalSpecie = null;
            selectedAnimalTextField.setText("Selecione um Animal...");
            selectedAnimalSpecieTextField.setText("Selecione um Animal...");

        } else if (selected instanceof Animal) {
            selectedAnimal = (Animal) selected;
            selectedAnimalTextField.setText(selectedAnimal.getName());

            // Pega o nome da espécie do animal
            selectedAnimalSpecie = SpecieDAO.getInstance().retrieveById(selectedAnimal.getSpecieId());
            selectedAnimalSpecieTextField.setText(selectedAnimalSpecie.getSpecieName());

            // Carregar as informações
            loadAnimalRecentAppointments();
            loadAnimalNextVaccDate();

        } else if (selected instanceof Veterinarian) {
            selectedVet = (Veterinarian) selected;

        } else if (selected instanceof Treatment) {
            selectedTreatment = (Treatment) selected;

        } else if (selected instanceof Appointment) {
            selectedAppointment = (Appointment) selected;
            selectedVet = VeterinarianDAO.getInstance().retrieveById(((Appointment) selected).getVetId());
        }
        // TODO: FAZER OS OUTROS TIPOS DE INSTACEOF
    }

    // MÉTODOS AUXILIÁRES
    public static void applyAlignment(JTable table) {
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.LEFT);

        // Define o alinhamento à todas as células menos Boolean
        for (int i = 0; i < table.getColumnCount(); i++) {
            Class<?> columnClass = table.getColumnClass(i);
            if (!columnClass.equals(Boolean.class)) {
                table.getColumnModel().getColumn(i).setCellRenderer(renderer);
            }
        }
    }

    // Carrega as consultas recentes do Animal selecionado
    public static String loadAnimalRecentAppointments() {
        List<Appointment> recentAppointments = AppointmentDAO.getInstance().retrieveRecentAppointments(getSelectedAnimal().getAnimalId());

        // Ordena manualmente por data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        recentAppointments.sort((a1, a2) -> {
            LocalDate date1 = LocalDate.parse(a1.getDate(), formatter);
            LocalDate date2 = LocalDate.parse(a2.getDate(), formatter);
            return date2.compareTo(date1);
        });

        StringBuilder sb = new StringBuilder();

        if (recentAppointments.isEmpty()) {
            sb.append("Nenhuma consulta encontrada.");
        } else {
            for (Appointment appointment : recentAppointments) {
                sb.append("Consulta do Dia: ").append(appointment.getDate())
                        .append(", Hora: ").append(appointment.getHour())
                        .append(", com Dr(a). ").append(
                                VeterinarianDAO.getInstance().retrieveById(appointment.getVetId()).getName()
                        )
                        .append("\n");
            }
        }

        return sb.toString();
    }

    // Carrega as informações da próxima vacinação do Animal selecionado
    public static String loadAnimalNextVaccDate() {
        List<Vaccination> nextVaccinations = VaccinationDAO.getInstance().retrieveNextVacc(
                getSelectedAnimal().getAnimalId(),
                getCurrentDate()
        );

        if (nextVaccinations.isEmpty()) {
            return "Nenhuma vacinação futura encontrada para o animal.";
        } else {
            // Pega a primeira vacinação da lista
            Vaccination nextVacc = nextVaccinations.getFirst();

            // Formata o texto com as informações
            return "Data: " + nextVacc.getNextDose() +
                    " | Vacina: " + nextVacc.getVaccineName() +
                    " | Veterinário responsável: " +
                    VeterinarianDAO.getInstance().retrieveById(nextVacc.getVetId()).getName();
        }
    }

    // Carrega todas as vacinações do Animal selecionado
    public static String loadAllAnimalVaccs() {
        List<Vaccination> allVacs = VaccinationDAO.getInstance().retrieveByAnimalId(getSelectedAnimal().getAnimalId());

        if (allVacs.isEmpty()) {
            return "Nenhuma vacinação registrada para o animal.";
        } else {
            StringBuilder sb = new StringBuilder();
            // Mostra a Data, Vacina e Veterinário de todas as vacinações
            for (Vaccination vac : allVacs) {
                String vetName = VeterinarianDAO.getInstance().retrieveById(vac.getVetId()).getName();
                sb.append("Data: ").append(vac.getVaccineDate())
                        .append(" | Vacina: ").append(vac.getVaccineName())
                        .append(" | Veterinário(a): ").append(vetName).append("\n");

            }
            return sb.toString();
        }
    }




    // Preenche o JComboBox com os Tratamentos do animal
    public static void populateTreatmentComboBox(JComboBox<String> comboBox, JCheckBox newTreatmentCheckBox) {
        List<Treatment> unfinishedTreatments = TreatmentDAO.getInstance()
                .retrieveUnfinishedTreatments(getSelectedAnimal().getAnimalId());

        comboBox.removeAllItems(); // Remove as opções anteriores

        if (unfinishedTreatments.isEmpty()) {
            // Caso não haja tratamentos, configura o comboBox para "Novo Tratamento"
            comboBox.addItem("Novo Tratamento");
            comboBox.setSelectedItem("Novo Tratamento");
            comboBox.getEditor().setItem("Novo Tratamento");
            newTreatmentCheckBox.setSelected(true); // Marca a checkbox automaticamente
        } else {
            for (Treatment treatment : unfinishedTreatments) {
                // Adiciona o tratamento com Descrição e Data de Início para evitar duplicidade
                comboBox.addItem(
                        treatment.getDescription() + " (" + treatment.getStartDate() + ")"
                );
            }
            newTreatmentCheckBox.setSelected(false); // Desmarca a checkbox por padrão
        }
    }


    // Verifica se o texto no JComboBox é valido
    public static void validateAndHandleTreatmentInput(JComboBox<String> comboBox, JCheckBox newTreatmentCheckBox) {
        // Texto atual do JComboBox (mesmo editável)
        String currentInput = (String) comboBox.getEditor().getItem();

        if (currentInput == null || currentInput.trim().isEmpty()) {
            newTreatmentCheckBox.setSelected(false); // Desmarca se o campo estiver vazio
            return;
        }

        // Recupera todos os tratamentos do animal selecionado
        List<Treatment> unfinishedTreatments = TreatmentDAO.getInstance()
                .retrieveUnfinishedTreatments(getSelectedAnimal().getAnimalId());

        // Verifica se o texto atual corresponde a algum tratamento existente
        boolean isExistingTreatment = unfinishedTreatments.stream()
                .map(treatment -> treatment.getDescription() + " (" + treatment.getStartDate() + ")")
                .anyMatch(option -> option.equals(currentInput));

        // Se não for um tratamento existente, marca como novo tratamento
        newTreatmentCheckBox.setSelected(!isExistingTreatment);
    }



/*    public static void handleNewTreatmentCheckbox(JComboBox<String> comboBox, JCheckBox newTreatmentCheckBox) {
        if (newTreatmentCheckBox.isSelected()) {
            // Define o texto como "Novo Tratamento" e exibe um alerta
            comboBox.setSelectedItem("Novo Tratamento");
            comboBox.getEditor().setItem("Novo Tratamento");
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira um novo tratamento.",
                    "Novo Tratamento",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Volta para o primeiro item e exibe um alerta
            if (comboBox.getItemCount() > 0) {
                comboBox.setSelectedIndex(0);
                comboBox.getEditor().setItem(comboBox.getItemAt(0));
            } else {
                comboBox.setSelectedItem(null); // Caso o combo esteja vazio
                comboBox.getEditor().setItem("");
            }
            JOptionPane.showMessageDialog(null,
                    "Selecione um tratamento existente.",
                    "Tratamento Existente",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }*/

    public static void handleNewTreatmentCheckbox(JComboBox<String> comboBox, JCheckBox newTreatmentCheckBox) {
        if (newTreatmentCheckBox.isSelected()) {
            comboBox.setSelectedItem("Novo Tratamento");
            comboBox.getEditor().setItem("Novo Tratamento");
            JOptionPane.showMessageDialog(null,
                    "Por favor, insira um novo tratamento.",
                    "Novo Tratamento",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Verifica se há tratamentos disponíveis no comboBox
            if (comboBox.getItemCount() <= 1 && "Novo Tratamento".equals(comboBox.getItemAt(0))) {
                newTreatmentCheckBox.setSelected(true); // Impede desmarcar
                JOptionPane.showMessageDialog(null,
                        "Nenhum tratamento encontrado. Você deve cadastrar um novo tratamento.",
                        "Nenhum Tratamento Disponível",
                        JOptionPane.WARNING_MESSAGE);
            } else if (comboBox.getItemCount() > 0 ){
                // Volta para o primeiro item e exibe um alerta
                comboBox.setSelectedIndex(0);
                comboBox.getEditor().setItem(comboBox.getItemAt(0));

                JOptionPane.showMessageDialog(null,
                        "Selecione um tratamento existente.",
                        "Tratamento Existente",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }


    // NÃO APAGA -> ESSA PORRA VAI SER CHAMADA NO BOTÃO DE CADASTRAR NOVA CONSULTA
    public static boolean validateComboBoxForAdding(JComboBox<String> comboBox) {
        String currentInput = (String) comboBox.getEditor().getItem();

        // Verifica se o campo está vazio ou é "Novo Tratamento"
        if (currentInput == null || currentInput.trim().isEmpty() || currentInput.equalsIgnoreCase("Novo Tratamento")) {
            JOptionPane.showMessageDialog(null,
                    "Por favor, selecione um tratamento existente ou insira um novo tratamento.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            return false; // Validação falhou
        }
        return true; // Validação passou
    }











    // Verifica se JTextField possui uma Data válida (dd/mm/yyyy)
    public static boolean isValidDate(JTextField dateField) {
        String dateText = dateField.getText().trim();

        // Verifica se o texto está no formato dd/mm/yyyy
        Pattern datePattern = Pattern.compile("^\\d{2}/\\d{2}/\\d{4}$");
        Matcher matcher = datePattern.matcher(dateText);
        if (!matcher.matches()) {
            return false;
        }

        // Divide a data em dia, mês e ano
        String[] parts = dateText.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);

        // Valida o dia
        if (day < 1 || day > 31) {
            return false;
        }

        // Valida o mês
        if (month < 1 || month > 12) {
            return false;
        }

        // Valida o ano
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            return false;
        }

        // Valida dias específicos para cada mês
        return isValidDayForMonth(day, month, year);
        // Se todas as verificações passaram, a data é válida
    }

    // Função auxiliar para validar os dias específicos de cada mês
    private static boolean isValidDayForMonth(int day, int month, int year) {
        switch (month) {
            case 4: case 6: case 9: case 11: // Abril, Junho, Setembro, Novembro têm no máximo 30 dias
                return day <= 30;
            case 2: // Fevereiro (ano bissexto ou não)
                if (isLeapYear(year)) {
                    return day <= 29;
                } else {
                    return day <= 28;
                }
            default: // Outros meses têm no máximo 31 dias
                return day <= 31;
        }
    }

    // Função auxiliar para verificar se é ano bissexto
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Função auxiliar que recupera a data atual (dd/mm/yyyy)
    public static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.now().format(formatter);
    }


    // Verifica se um JTextField possui um Horário válido (HH:mm)
    public static boolean isValidTime(JTextField timeFIeld) {
        String input = timeFIeld.getText();
        return input.matches("^([01]\\d|2[0-3]):([0-5]\\d)$"); // O horário está no formato certo
    }

    // CARREGAMENTO DE DADOS NAS TABELAS

    // Clientes
    public static void loadAllClients(JTable table) {
        table.setModel(new ClientTableModel(ClientDAO.getInstance().retrieveAll()));
        applyAlignment(table);
    }

    // Animais
    public static void loadAnimalsByOwner(JTable table) {
        table.setModel(new AnimalTableModel(
                AnimalDAO.getInstance().retrieveByOwnerId(getSelectedClient().getClientId()))
        );
        applyAlignment(table);
    }

    public static void loadEmptyAnimalTable(JTable table) {
        table.setModel(new AnimalTableModel(new ArrayList<>()));
        applyAlignment(table);
    }

    // Veterinários
    public static void loadAllVets(JTable table) {
        table.setModel(new VeterinarianTableModel(VeterinarianDAO.getInstance().retrieveAll()));
        applyAlignment(table);
    }

    // Tratamentos
    public static void loadAllTreatments(JTable table, JTable appointmentsTable, JTable examsTable) {
        table.setModel(new TreatmentTableModel(TreatmentDAO.getInstance().retrieveAll()));
        applyAlignment(table);

        // Limpa as tabelas relacionadas
        appointmentsTable.setModel(new AppointmentTableModel(new ArrayList<>()));
        applyAlignment(appointmentsTable);
        examsTable.setModel(new ExamTableModel(new ArrayList<>()));
        applyAlignment(examsTable);
    }

    public static void loadTreatmentsByAnimal(JTable table, JTable appointmentsTable, JTable examsTable) {
        table.setModel(new TreatmentTableModel(
                TreatmentDAO.getInstance().retrieveByAnimalId(getSelectedAnimal().getAnimalId()))
        );
        applyAlignment(table);

        // Limpa as tabelas relacionadas
        appointmentsTable.setModel(new AppointmentTableModel(new ArrayList<>()));
        applyAlignment(appointmentsTable);
        examsTable.setModel(new ExamTableModel(new ArrayList<>()));
        applyAlignment(examsTable);

    }

    // Consultas
    public static void loadAppointmentsByTreatment(JTable table) {
        table.setModel(new AppointmentTableModel(
                AppointmentDAO.getInstance().retrieveByTreatmentId(getSelectedTreatment().getTreatmentId()))
        );
        applyAlignment(table);
    }

    public static void loadAppointmentsByAnimal(JTable table) {
        table.setModel(new AppointmentTableModel(
                AppointmentDAO.getInstance().retrieveByAnimalId(getSelectedAnimal().getAnimalId())
        ));
        applyAlignment(table);
    }

    public static void loadEmptyAppointmentsTable(JTable table) {
        table.setModel(new AppointmentTableModel(new ArrayList<>()));
        applyAlignment(table);
    }

    // Exames
    public static void loadExamsByTreatment(JTable table) {
        table.setModel(new ExamTableModel(
                ExamDAO.getInstance().retrieveAllExamsOfATreatment(getSelectedTreatment().getTreatmentId()))
        );
        applyAlignment(table);
    }

    public static void loadExamsByAppointment(JTable table) {
        table.setModel(new ExamTableModel(
                ExamDAO.getInstance().retrieveByAppointmentId(getSelectedAppointment().getAppointmentId()))
        );
        applyAlignment(table);
    }







}
