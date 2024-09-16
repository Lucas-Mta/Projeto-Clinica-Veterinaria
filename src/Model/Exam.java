package Model;

import java.util.Date;

public class Exam {
    private Appointment appointment;
    private String examType;
    private String description;
    private Date requestDate;
    private String status;
    private String results;

    public Exam(Appointment appointment, String examType, String description, Date requestDate, String status) {
        this.appointment = appointment;
        this.examType = examType;
        this.description = description;
        this.requestDate = requestDate;
        this.status = status;
    }

    // Getters
    public Appointment getAppointment() {
        return appointment;
    }

    public String getExamType() {
        return examType;
    }

    public String getDescription() {
        return description;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public String getStatus() {
        return status;
    }

    public String getResults() {
        return results;
    }

    // Setters
    public void setDescription(String description) { this.description = description; }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResults(String results) { this.results = results; }

}
