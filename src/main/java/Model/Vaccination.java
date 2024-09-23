package Model;

public class Vaccination {
    private int vaccinationId;
    private int vetId;
    private int animalId;
    private String vaccineName;
    private String vaccineDate;
    private String nextDose;

    public Vaccination(int vaccinationId, int vetId, int animalId, String vaccineName, String vaccineDate, String nextDose) {
        this.vaccinationId = vaccinationId;
        this.vetId = vetId;
        this.animalId = animalId;
        this.vaccineName = vaccineName;
        this.vaccineDate = vaccineDate;
        this.nextDose = nextDose;
    }

    // Getters
    public int getVaccinationId() {
        return vaccinationId;
    }

    public int getVetId() {
        return vetId;
    }

    public int getAnimalId() {
        return animalId;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public String getVaccineDate() {
        return vaccineDate;
    }

    public String getNextDose() {
        return nextDose;
    }

    // Setters
    public void setVetId(int vetId) {
        this.vetId = vetId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public void setVaccineDate(String vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public void setNextDose(String nextDose) {
        this.nextDose = nextDose;
    }

    @Override
    public String toString() {
        return "Vacinação [ID: " + vaccinationId
                + ", ID do Veterinário: " + vetId
                + ", ID do Animal: " + animalId
                + ", Nome da Vacina: " + vaccineName
                + ", Data da Vacinação: " + vaccineDate
                + ", Próxima Dose: " + nextDose
                + "]";
    }
}
