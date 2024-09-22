package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VeterinarianDAO extends DAO {

    private static VeterinarianDAO instance;

    private VeterinarianDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe VeterinarianDAO
    public static VeterinarianDAO getInstance() {
        return (instance == null ? (instance = new VeterinarianDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Veterinarian create(String cpf, String name, String address, String phone, String email, String login, String password, String specialty, Time serviceHour, int roomNum) {
        try {
            // Inserir na tabela Pessoa (herança de Veterinarian)
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Pessoa (cpf, nome, endereco, telefone, email) VALUES (?, ?, ?, ?, ?)");
            statement.setString(1, cpf);
            statement.setString(2, name);
            statement.setString(3, address);
            statement.setString(4, phone);
            statement.setString(5, email);
            executeUpdate(statement);

            // Inserir na tabela Funcionario
            statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Funcionario (cpf, nivelAcesso, login, senha) VALUES (?, ?, ?, ?)");
            statement.setString(1, cpf);
            statement.setInt(2, 1); // Acesso nível 1 para Veterinários
            statement.setString(3, login);
            statement.setString(4, password);
            executeUpdate(statement);

            // Inserir na tabela Veterinario
            statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Veterinario (cpf, especialidade, horaAtendimento, numSala) VALUES (?, ?, ?, ?)");
            statement.setString(1, cpf);
            statement.setString(2, specialty);
            statement.setTime(3, serviceHour);
            statement.setInt(4, roomNum);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(VeterinarianDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Veterinario", "idVeterinario"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Veterinarian buildObject(ResultSet resultSet) {
        Veterinarian veterinarian = null;
        try {
            veterinarian = new Veterinarian(
                    resultSet.getString("cpf"),
                    resultSet.getString("nome"),
                    resultSet.getString("endereco"),
                    resultSet.getString("telefone"),
                    resultSet.getString("email"),
                    resultSet.getString("login"),
                    resultSet.getString("senha"),
                    resultSet.getInt("idVeterinario"),
                    resultSet.getString("especialidade"),
                    resultSet.getTime("horaAtendimento"),
                    resultSet.getInt("numSala")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return veterinarian;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de veterinários
    public List<Veterinarian> retrieve(String query) {
        List<Veterinarian> veterinarians = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                veterinarians.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return veterinarians;
    }

    // Recupera todos os veterinários
    public List<Veterinarian> retrieveAll() {
        return this.retrieve("SELECT * FROM Pessoa p JOIN Funcionario f ON p.cpf = f.cpf JOIN Veterinario v ON f.cpf = v.cpf");
    }

    // Recupera veterinário por ID
    public Veterinarian retrieveById(int id) {
        List<Veterinarian> veterinarians = this.retrieve("SELECT * FROM Pessoa p JOIN Funcionario f ON p.cpf = f.cpf JOIN Veterinario v ON f.cpf = v.cpf WHERE v.idVeterinario = " + id);
        return (veterinarians.isEmpty() ? null : veterinarians.getFirst());
    }

    // Recupera veterinário por CPF
    public Veterinarian retrieveByCpf(String cpf) {
        List<Veterinarian> veterinarians = this.retrieve("SELECT * FROM Pessoa p JOIN Funcionario f ON p.cpf = f.cpf JOIN Veterinario v ON f.cpf = v.cpf WHERE v.cpf = '" + cpf + "'");
        return (veterinarians.isEmpty() ? null : veterinarians.getFirst());
    }

    // UPDATE --------------------------------------
    public void update(Veterinarian veterinarian) {
        try {
            // Atualiza dados da tabela Pessoa
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Pessoa SET nome=?, endereco=?, telefone=?, email=? WHERE cpf=?");
            statement.setString(1, veterinarian.getName());
            statement.setString(2, veterinarian.getAddress());
            statement.setString(3, veterinarian.getPhone());
            statement.setString(4, veterinarian.getEmail());
            statement.setString(5, veterinarian.getCpf());
            executeUpdate(statement);

            // Atualiza dados da tabela Funcionario
            statement = DAO.getConnection().prepareStatement(
                    "UPDATE Funcionario SET login=?, senha=? WHERE cpf=?");
            statement.setString(1, veterinarian.getLogin());
            statement.setString(2, veterinarian.getPassword());
            statement.setString(3, veterinarian.getCpf());
            executeUpdate(statement);

            // Atualiza dados da tabela Veterinario
            statement = DAO.getConnection().prepareStatement(
                    "UPDATE Veterinario SET especialidade=?, horaAtendimento=?, numSala=? WHERE cpf=?");
            statement.setString(1, veterinarian.getSpecialty());
            statement.setTime(2, veterinarian.getServiceHour());
            statement.setInt(3, veterinarian.getRoomNum());
            statement.setString(4, veterinarian.getCpf());
            executeUpdate(statement);

        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Veterinarian veterinarian) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Veterinario WHERE idVeterinario = ?");
            statement.setInt(1, veterinarian.getVetId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
