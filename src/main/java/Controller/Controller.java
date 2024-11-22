package Controller;

import Model.*;
import View.AnimalTableModel;
import View.GenericTableModel;

import javax.swing.*;

public class Controller {
    private static Client selectedClient = null;
    private static Animal selectedAnimal = null;
    private static Specie selectedAnimalSpecie = null;

    private static JTextField selectedClientTextField = null;
    private static JTextField selectedAnimalTextField = null;
    private static JTextField selectedAnimalSpecieTextField = null;

    private static JTable animalTable = null;
    private static JTable appointmentsOfATreatmentTable = null; // Página de Tratamentos
    private static JTable examsOfATreatmentTable = null;
    private static JTable selectedAnimalAppointmentsTable = null; // Página de Exame

    public static void setTextFields(JTextField client, JTextField animal, JTextField animalSpecie) {
        selectedClientTextField = client;
        selectedAnimalTextField = animal;
        selectedAnimalSpecieTextField = animalSpecie;
    }

    public static void setTablesToModifyAfter(JTable animal, JTable treatmentsAppointment, JTable treatmentsExam, JTable animalAppointments) {
        animalTable = animal;
        appointmentsOfATreatmentTable = treatmentsAppointment;
        examsOfATreatmentTable = treatmentsExam;
        selectedAnimalAppointmentsTable = animalAppointments;
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

    // SETTER
    public static void setSelected(Object selected) {
        if (selected instanceof Client) {
            selectedClient = (Client) selected;
            selectedClientTextField.setText(selectedClient.getName());
            selectedAnimalTextField.setText("Selecione um Animal...");
            selectedAnimal = null;
            selectedAnimalSpecieTextField.setText("Selecione um Animal...");
            selectedAnimalSpecie = null;

            setAnimalsBySelectedClient(selectedClient); // Modifica a tabela de animal
        } else if (selected instanceof Animal) {
            selectedAnimal = (Animal) selected;
            selectedAnimalTextField.setText(selectedAnimal.getName());

            // Pega o nome da espécie do animal
            selectedAnimalSpecie = SpecieDAO.getInstance().retrieveById(selectedAnimal.getSpecieId());
            selectedAnimalSpecieTextField.setText(selectedAnimalSpecie.getSpecieName());
        }
        // TODO: FAZER OS OUTROS TIPOS DE INSTACEOF
    }

    public static void setAnimalsBySelectedClient(Client selectedClient) {
        animalTable.setModel(new AnimalTableModel(AnimalDAO.getInstance().retrieveByOwnerId(selectedClient.getClientId())));
    }
}
