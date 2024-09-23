package Model;



public class Appointment {
    private int appointmentId;
    private String date;
    private String hour;
    private int animalId;
    private int vetId;
    private int treatmentId;
    private String symptoms;

    public Appointment(int appointmentId, String date, String hour, int animalId, int vetId, int treatmentId, String symptoms) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.hour = hour;
        this.animalId = animalId;
        this.vetId = vetId;
        this.treatmentId = treatmentId;
        this.symptoms = symptoms;
    }

    // Getters
    public int getAppointmentId() {
        return appointmentId;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public int getAnimalId() {
        return animalId;
    }

    public int getVetId() {
        return vetId;
    }

    public int getTreatmentId() {
        return treatmentId;
    }

    public String getSymptoms() {
        return symptoms;
    }


    // Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public void setTreatmentId(int treatmentId) {
        this.treatmentId = treatmentId;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String toString() {
        return "Consulta [ID: " + appointmentId
                + ", Data: "+  date
                + ", Hora: " + hour
                + ", ID do Animal: " + animalId
                + ", ID do Veterinário: " + vetId
                + ", ID do Tratamento: " + treatmentId
                + ", Sintomas: " + symptoms
                + "]";
    }
}
