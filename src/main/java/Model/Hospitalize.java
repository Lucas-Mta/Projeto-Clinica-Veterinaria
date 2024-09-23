package Model;

public class Hospitalize {
    private int hospitalizationId;
    private int vetId;
    private int animalId;
    private String startDate;
    private String endDate;
    private String progress;

    public Hospitalize(int hospitalizationId, int vetId, int animalId, String startDate, String endDate, String progress) {
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

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getProgress() {
        return progress;
    }

    // Setters
    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    @Override
    public String toString() {
        return "Internação [ID: " + hospitalizationId
                + ", ID do Veterinário: " + vetId
                + ", ID do Animal: " + animalId
                + ", Data Começo: " + startDate
                + ", Data Fim: " + endDate
                + ", Progresso: " + progress
                + "]";
    }
}
