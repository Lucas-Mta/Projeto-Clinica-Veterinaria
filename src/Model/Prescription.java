package Model;

public class Prescription {
    private int vetId;
    private int appointmentId;
    private int drugId;
    private String healthProblem;
    private int dosage;
    private String instructions;

    public Prescription(int vetId, int appointmentId, int drugId, String healthProblem, int dosage, String instructions) {
        this.vetId = vetId;
        this.appointmentId = appointmentId;
        this.drugId = drugId;
        this.healthProblem = healthProblem;
        this.dosage = dosage;
        this.instructions = instructions;
    }

    // Getters
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

    public int getDosage() {
        return dosage;
    }

    public String getInstructions() {
        return instructions;
    }

    // Setters
    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    public void setHealthProblem(String healthProblem) {
        this.healthProblem = healthProblem;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
