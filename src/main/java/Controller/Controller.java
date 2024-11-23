package Controller;

import Model.*;
import View.TableModels.*;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private static Client selectedClient = null;
    private static Animal selectedAnimal = null;
    private static Specie selectedAnimalSpecie = null;
    private static Veterinarian selectedVet = null;
    private static Treatment selectedTreatment = null;
    private static Appointment selectedAppointment = null;

    private static List<Appointment> recentAppointments = null;

    private static JTextField selectedClientTextField = null;
    private static JTextField selectedAnimalTextField = null;
    private static JTextField selectedAnimalSpecieTextField = null;

    public static void setTextFields(JTextField client, JTextField animal, JTextField animalSpecie) {
        selectedClientTextField = client;
        selectedAnimalTextField = animal;
        selectedAnimalSpecieTextField = animalSpecie;
    }

    public static void setTableModel(JTable table, GenericTableModel tableModel) {
        table.setModel(tableModel);
    }

    // GETTERS
    public static Client getSelectedClient() {
        return selectedClient;
    }

    public static Animal getSelectedAnimal() {
        return selectedAnimal;
    }

    public static Specie getSelectedAnimalSpecie() {
        return selectedAnimalSpecie;
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
            selectedAnimalSpecie = getSpecieById(selectedAnimal.getSpecieId());
            selectedAnimalSpecieTextField.setText(selectedAnimalSpecie.getSpecieName());

            // Carregar as informações
            loadAnimalInfo();

        } else if (selected instanceof Veterinarian) {
            selectedVet = (Veterinarian) selected;

        } else if (selected instanceof Treatment) {
            selectedTreatment = (Treatment) selected;

        } else if (selected instanceof Appointment) {
            selectedAppointment = (Appointment) selected;
        }
        // TODO: FAZER OS OUTROS TIPOS DE INSTACEOF
    }

    // MÉTODOS AUXILIÁRES
    private static Specie getSpecieById(int specieId) {
        return SpecieDAO.getInstance().retrieveById(specieId);
    }

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

    public static String loadAnimalInfo() {
        recentAppointments = AppointmentDAO.getInstance().retrieveRecentAppointments(getSelectedAnimal().getAnimalId());

        // Cria um StringBuilder pra armazenar as informações formatadas
        StringBuilder sb = new StringBuilder();

        if (recentAppointments.isEmpty()) {
            sb.append("Nenhuma consulta encontrada.");
        } else {
            for (Appointment appointment : recentAppointments) {
                sb.append("Veterinário: ").append(VeterinarianDAO.getInstance().retrieveById(appointment.getVetId()).getName())
                        .append(" | Data: ").append(appointment.getDate())  // Supondo que 'getDate()' retorne a data
                        .append(" | Hora: ").append(appointment.getHour())  // Supondo que 'getTime()' retorne a hora
                        .append("\n-------------------\n");
            }
        }

        return sb.toString();
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
