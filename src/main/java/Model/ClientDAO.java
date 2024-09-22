package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientDAO extends DAO {

    private static ClientDAO instance;

    private ClientDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe ClientDAO
    public static ClientDAO getInstance() {
        return (instance == null ? (instance = new ClientDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Client create(String cpf, String name, String address, String phone, String email) {
        try {
            // Inserir na tabela Pessoa (herança)
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Pessoa (cpf, nome, endereco, telefone, email) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, cpf);
            statement.setString(2, name);
            statement.setString(3, address);
            statement.setString(4, phone);
            statement.setString(5, email);
            executeUpdate(statement);

            // Inserir na tabela Cliente
            statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Cliente (cpf) VALUES (?)");
            statement.setString(1, cpf);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Cliente", "idCliente"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Client buildObject(ResultSet resultSet) {
        Client client = null;
        try {
            client = new Client(
                    resultSet.getString("cpf"),
                    resultSet.getString("nome"),
                    resultSet.getString("endereco"),
                    resultSet.getString("telefone"),
                    resultSet.getString("email"),
                    resultSet.getInt("idCliente")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return client;
    }


    // RETRIEVE --------------------------------------
    // Recuperador geral de clientes
    public List<Client> retrieve(String query) {
        List<Client> clients = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                clients.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return clients;
    }

    // Recupera todos os clientes
    public List<Client> retrieveAll() {
        return this.retrieve("SELECT * FROM Pessoa p JOIN Cliente c ON p.cpf = c.cpf");
    }

    // Recupera cliente por ID
    public Client retrieveById(int id) {
        List<Client> clients = this.retrieve("SELECT * FROM Pessoa p JOIN Cliente c ON p.cpf = c.cpf WHERE c.idCliente = " + id);
        return (clients.isEmpty() ? null : clients.getFirst());
    }

    // Recupera cliente por CPF
    public Client retrieveByCpf(String cpf) {
        List<Client> clients = this.retrieve("SELECT * FROM Pessoa p JOIN Cliente c ON p.cpf = c.cpf WHERE c.cpf = '" + cpf + "'");
        return (clients.isEmpty() ? null : clients.getFirst());
    }


    // UPDATE --------------------------------------
    public void update(Client client) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Pessoa SET nome=?, endereco=?, telefone=?, email=? WHERE cpf=?");
            statement.setString(1, client.getName());
            statement.setString(2, client.getAddress());
            statement.setString(3, client.getPhone());
            statement.setString(4, client.getEmail());
            statement.setString(5, client.getCpf());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }


    // DELETE --------------------------------------
    public void delete(Client client) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Cliente WHERE idCliente = ?");
            statement.setInt(1, client.getClientId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
