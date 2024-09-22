package Model;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private int clientId;
    private List<Animal> animals;

    public Client(String cpf, String name, String address, String phone, String email, int clientId) {
        super(cpf, name, address, phone, email);
        this.clientId = clientId;
    }

    // Getters

    public int getClientId() { return clientId; }

    public List<Animal> getAnimals() {
        return new ArrayList<Animal>(animals); // Cópia da lista
    }

    // Adicionar um novo animal na lista
    public void addAnimal(Animal animal) {
        if (!animal.getName().isBlank()) {
            animals.add(animal);
        }
    }

    @Override
    public String toString() {
        return "Cliente [Nome: " + getName() + ", CPF: " + getCpf()
                + ", Telefone: " + getPhone() + ", Email: " + getEmail()
                + ", ID: " + clientId + "]";
    }
}
