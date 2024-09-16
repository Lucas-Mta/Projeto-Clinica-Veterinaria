package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treatment {
    private int treatmentId;
    private int animalId;
    private Date startDate;
    private Date endDate;
    private String description;
    private List<Exam> exams;
    private boolean finished;

    public Treatment(int treatmentId, int animalId, Date startDate, List<Exam> exams, boolean finished) {
        this.treatmentId = treatmentId;
        this.animalId = animalId;
        this.startDate = startDate;
        this.exams = new ArrayList<Exam>(); // Cria uma lista vazia para armazenar os exames
        this.finished = false;
    }

    // Getters
    public int getTreatmentId() {
        return treatmentId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public List<Exam> getExams() {
        return new ArrayList<Exam>(exams);
    }

    public boolean isFinished() {
        return finished;
    }


    // Setters
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
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

}
