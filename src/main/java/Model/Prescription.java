package Model;

public class Prescription {
    private int prescriptionId;
    private int vetId;
    private int appointmentId;
    private int drugId;
    private String healthProblem;
    private float dosage;
    private String instructions;

    public Prescription(int prescriptionId, int vetId, int appointmentId, int drugId, String healthProblem, float dosage, String instructions) {
        this.prescriptionId = prescriptionId;
        this.vetId = vetId;
        this.appointmentId = appointmentId;
        this.drugId = drugId;
        this.healthProblem = healthProblem;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    // Getters
    public int getPrescriptionId() {
        return prescriptionId;
    }

    public int getVetId() {
        return vetId;
    }

    public int getAppointmentId() {
        return appointmentId;
    }

    public int getDrugId() {
        return drugId;
    }

    public String getHealthProblem() {
        return healthProblem;
    }

    public float getDosage() {
        return dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    // Setters
    public void setHealthProblem(String healthProblem) {
        this.healthProblem = healthProblem;
    }

    public void setDosage(float dosage) {
        this.dosage = dosage;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "Prescrição [ID: " + prescriptionId
                + ", ID do Veterinário: " + vetId
                + ", ID da Consulta: " + appointmentId
                + ", ID do Medicamento: " + drugId
                + ", Problema de Saúde: " + healthProblem
                + ", Dosagem: " + dosage
                + ", Instruções: " + instructions
                + "]";
    }
}
