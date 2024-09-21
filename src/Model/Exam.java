package Model;

import java.util.Date;

public class Exam {
    private int examId;
    private int appointmentId;
    private String examType;
    private String description;
    private Date requestDate;
    private String status;
    private String results;

    public Exam(int examId, int appointmentId, String examType, String description, Date requestDate, String status, String results) {
        this.examId = examId;
        this.appointmentId = appointmentId;
        this.examType = examType;
        this.description = description;
        this.requestDate = requestDate;
        this.status = status;
        this.results = results;
    }

    // Getters
    public int getExamId() {
        return examId;
    }

    public int getAppointmentId() {
        return appointmentId;
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
    public void setExamType(String examType) {
        this.examType = examType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResults(String results) {
        this.results = results;
    }

}
