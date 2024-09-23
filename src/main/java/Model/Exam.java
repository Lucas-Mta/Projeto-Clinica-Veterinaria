package Model;


public class Exam {
    private int examId;
    private int appointmentId;
    private String examType;
    private String description;
    private String requestDate;
    private String status;
    private String results;

    public Exam(int examId, int appointmentId, String examType, String description, String requestDate, String status, String results) {
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

    public String getRequestDate() {
        return requestDate;
    }

    public String getStatus() {
        return status;
    }

    public String getResults() {
        return results;
    }

    // Setters
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResults(String results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Exame [ ID: " + examId
                + ", Tipo: " + examType
                + ", Descrição: " + description
                + ", Data de Requisição: " + requestDate
                + ", Status: " + status
                + ", Resultados: " + results
                + "]";
    }
}
