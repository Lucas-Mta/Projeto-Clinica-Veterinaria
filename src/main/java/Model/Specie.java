package Model;

public class Specie {
    private int specieId;
    private String specieName;

    public Specie(int specieId, String specieName) {
        this.specieId = specieId;
        this.specieName = specieName;
    }

    // Getters
    public int getSpecieId() {
        return specieId;
    }

    public String getSpecieName() {
        return specieName;
    }

    // Setter
    public void setSpecieName(String specieName) {
        this.specieName = specieName;
    }

    @Override
    public String toString() {
        return "Espécie [ID: " + specieId
                + ", Nome: " + specieName
                + "]";
    }
}
