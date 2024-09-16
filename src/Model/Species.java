package Model;

public class Species {
    private int specieId;
    private String specieName;

    public Species(int specieId, String specieName) {
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

}
