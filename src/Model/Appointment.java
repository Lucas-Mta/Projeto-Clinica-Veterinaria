package Model;

import java.sql.Time;
import java.util.Date;

public class Appointment {
    private int appointmentId;
    private Date date;
    private Time hour;
    private int animalId;
    private int vetId;
    private int treatmentId;
    private String symptoms;

    public Appointment(int appointmentId, Date date, Time hour, int animalId, int vetId, int treatmentId, String symptoms) {
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

    public Date getDate() {
        return date;
    }

    public Time getHour() {
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

    public void setDate(Date date) {
        this.date = date;
    }

    public void setHour(Time hour) {
        this.hour = hour;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

}
