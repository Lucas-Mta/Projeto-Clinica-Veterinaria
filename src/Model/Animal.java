package Model;

public class Animal {
    private int animalId;
    private String name;
    private int age;
    private char gender;
    private Double weight;
    private int ownerId;
    private int specieId;

    public Animal(int animalId, String name, int age, char gender, Double weight, int ownerId, int specieId) {
        this.animalId = animalId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.ownerId = ownerId;
        this.specieId = specieId;
    }

    // Getters
    public int getAnimalId() {
        return animalId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Double getWeight() {
        return weight;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public int getSpecieId() {
        return specieId;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

}
