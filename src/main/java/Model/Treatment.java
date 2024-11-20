package Model;

import java.util.List;

public class Treatment {
    private int treatmentId;
    private int animalId;
    private String startDate;
    private String endDate;
    private String description;
    private List<Exam> exams;
    private boolean finished;

    public Treatment(int treatmentId, int animalId, String startDate, String endDate, String description, boolean finished) {
        this.treatmentId = treatmentId;
        this.animalId = animalId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.finished = finished;
    }

    // Getters
    public int getTreatmentId() {
        return treatmentId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return finished;
    }

    // Setters
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    // Adicionando um novo exame na lista
    public void addExam(Exam exam) {
        this.exams.add(exam);
    }

    @Override
    public String toString() {
        return "Tratamento [ID: " + treatmentId
                + ", ID do Animal: " + animalId
                + ", Data do Início: " + startDate
                + ", Data do Fim: " + endDate
                + ", Descrição: " + description
                + ", Encerrado: " + finished
                + "]";
    }
}
