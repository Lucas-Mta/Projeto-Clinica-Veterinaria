package Model;

public class Main {
    public static void main(String[] args) {


        /*
        * Fazer testes com a criação de todas as classes para ver se
        * os comandos sql estão todos certos
        *
        * Observar a questão das listas, por exemplo:
        * Cliente tem lista de animais que vão armazenar os objetos que vão ser recuperados
        * do banco de dados. Ver se essa recuepração e atribuição está a ser feita
        * corretamente.
        * Talvez nem seja necessário criar essa lista na própria classe cliente, pode
        * ser que até que crie uma lista bem quando vai recuperar no main.
        * ou não também, não sei
        *
        * */


        // Obtenha a instância de ClientDAO
        ClientDAO clientDAO = ClientDAO.getInstance();

        // Inserir um novo cliente
        System.out.println("Inserindo um novo cliente...");
        Client novoCliente = clientDAO.create("12345678910", "Lucas", "Rua A, 123", "71987654321", "emailFoda@gmail.com");
        System.out.println("Cliente inserido: " + novoCliente);

        // Recuperar cliente por CPF
        System.out.println("\nRecuperando cliente pelo CPF...");
        Client clienteRecuperado = clientDAO.retrieveByCpf("12345678910");
        if (clienteRecuperado != null) {
            System.out.println("Cliente recuperado: " + clienteRecuperado);
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // Atualizar cliente
        System.out.println("\nAtualizando cliente...");
        if (clienteRecuperado != null) {
            clienteRecuperado.setAddress("Rua B, 456");
            clienteRecuperado.setPhone("71987654321");
            clientDAO.update(clienteRecuperado);
            System.out.println("Cliente atualizado: " + clienteRecuperado);
        }

        // Exibir todos os clientes
        System.out.println("\nListando todos os clientes...");
        for (Client c : clientDAO.retrieveAll()) {
            System.out.println(c);
        }

        // Deletar cliente
        System.out.println("\nDeletando cliente...");
        if (clienteRecuperado != null) {
            clientDAO.delete(clienteRecuperado);
            System.out.println("Cliente deletado.");
        }

        // Tentar recuperar o cliente deletado
        System.out.println("\nTentando recuperar cliente deletado...");
        Client clienteDeletado = clientDAO.retrieveByCpf("12345678910");
        if (clienteDeletado == null) {
            System.out.println("Cliente não encontrado, foi deletado.");
        }

    }
}
