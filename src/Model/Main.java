package Model;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(1,"12345678910", "Lucas", "Rua X, numero 3",
                "00988888888", "luccas.mta@gmail.com");

        Species gato = new Species(1, "Gato");
        Animal animal1 = new Animal(1,"Totó", 10, 'M',7.0, client1.getClientId(), gato.getSpecieId());
        Animal animal2 = new Animal(2,"Leo", 2, 'M',10.0, client1.getClientId(), gato.getSpecieId());

        client1.addAnimal(animal1);
        client1.addAnimal(animal2);

        System.out.println(client1.getAnimals());

    }
}
