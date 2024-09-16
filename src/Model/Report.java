package Model;

import java.util.Date;

public class Report {
    private int quantAnimals;
    private int quantTreatments;
    private int quantAppointments;
    private int quantMedicines;

    public Report(int quantAnimals, int quantTreatments, int quantAppointments, int quantMedicines) {
        this.quantAnimals = quantAnimals;
        this.quantTreatments = quantTreatments;
        this.quantAppointments = quantAppointments;
        this.quantMedicines = quantMedicines;
    }

    // Getters
    public int getQuantAnimals() {
        return quantAnimals;
    }

    public int getQuantTreatments() {
        return quantTreatments;
    }

    public int getQuantAppointments() {
        return quantAppointments;
    }

    public int getQuantMedicines() {
        return quantMedicines;
    }

    // Setters
    public void setQuantAnimals(int quantAnimals) {
        this.quantAnimals = quantAnimals;
    }

    public void setQuantTreatments(int quantTreatments) {
        this.quantTreatments = quantTreatments;
    }

    public void setQuantAppointments(int quantAppointments) {
        this.quantAppointments = quantAppointments;
    }

    public void setQuantMedicines(int quantMedicines) {
        this.quantMedicines = quantMedicines;
    }

    // Métodos de Model.Report
    public void consultasPorPeriodo(Date inicio, Date fim) {
        // Implementação de filtro de consultas por período
        System.out.println("Consultas realizadas entre " + inicio + " e " + fim);
        // Ver como fazer a busca de dados de consultas do sistema
    }

    public void tratamentosPorPeriodo(Date inicio, Date fim) {
        // Implementação de filtro de tratamentos por período
        System.out.println("Tratamentos realizados entre " + inicio + " e " + fim);
        // Ver como fazer a busca de dados de consultas do sistema
    }

    public void mostrarInfos() {
        System.out.println("Relatório de Informações:");
        System.out.println("Quantidade de Animais: " + getQuantAnimals());
        System.out.println("Quantidade de Tratamentos: " + getQuantTreatments());
        System.out.println("Quantidade de Consultas: " + getQuantAppointments());
        System.out.println("Quantidade de Medicamentos: " + getQuantMedicines());
    }

}
