package Model;

import java.util.Date;

public class Hospitalize {
    private int hospitalizationId;
    private int vetId;
    private int animalId;
    private Date startDate;
    private Date endDate;
    private String progress;

    public Hospitalize(int hospitalizationId, int vetId, int animalId, Date startDate, Date endDate, String progress) {
        this.hospitalizationId = hospitalizationId;
        this.vetId = vetId;
        this.animalId = animalId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.progress = progress;
    }

    // Getters
    public int getHospitalizationId() {
        return hospitalizationId;
    }

    public int getVetId() {
        return vetId;
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

    public String getProgress() {
        return progress;
    }

    // Setters
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

}
