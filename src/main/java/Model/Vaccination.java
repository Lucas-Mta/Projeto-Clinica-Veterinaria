package Model;

import java.util.Date;

public class Vaccination {
    private int vaccinationId;
    private int vetId;
    private int animalId;
    private String vaccineName;
    private Date vaccineDate;
    private Date nextDose;

    public Vaccination(int vaccinationId, int vetId, int animalId, String vaccineName, Date vaccineDate, Date nextDose) {
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

    public Date getVaccineDate() {
        return vaccineDate;
    }

    public Date getNextDose() {
        return nextDose;
    }

    // Setters
    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public void setVaccineDate(Date vaccineDate) {
        this.vaccineDate = vaccineDate;
    }

    public void setNextDose(Date nextDose) {
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
