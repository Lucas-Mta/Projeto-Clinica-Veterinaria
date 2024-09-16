package Model;

public class Animal {
    private int animalId;
    private String name;
    private int age;
    private char gender;
    private Double weight;
    private Client owner;
    private Species specie;

    public Animal(int animalId, String name, int age, char gender, Double weight, Client owner, Species specie) {
        this.animalId = animalId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.owner = owner;
        this.specie = specie;
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

    public Species getSpecie() {
        return specie;
    }

    public Client getOwner() {
        return owner;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

}
