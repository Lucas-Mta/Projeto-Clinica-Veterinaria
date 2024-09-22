package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecretaryDAO extends DAO {

    private static SecretaryDAO instance;

    private SecretaryDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe SecretaryDAO
    public static SecretaryDAO getInstance() {
        return (instance == null ? (instance = new SecretaryDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Secretary create(String cpf, String name, String address, String phone, String email, String login, String password, String workShift) {
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

            // Inserir na tabela Funcionario
            statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Funcionario (cpf, nivelAcesso, login, senha) VALUES (?, ?, ?, ?)");
            statement.setString(1, cpf);
            statement.setInt(2, 0); // Acesso nível 0 para Secretários
            statement.setString(3, password);
            statement.setString(4, login);
            executeUpdate(statement);

            // Inserir na tabela Secretario
            statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Secretario (cpf, turno) VALUES (?, ?)");
            statement.setString(1, cpf);
            statement.setString(2, workShift);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(SecretaryDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Secretario", "idSecretario"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Secretary buildObject(ResultSet resultSet) {
        Secretary secretary = null;
        try {
            secretary = new Secretary(
                    resultSet.getString("cpf"),
                    resultSet.getString("nome"),
                    resultSet.getString("endereco"),
                    resultSet.getString("telefone"),
                    resultSet.getString("email"),
                    resultSet.getString("login"),
                    resultSet.getString("senha"),
                    resultSet.getInt("idSecretario"),
                    resultSet.getString("turno")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return secretary;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de secretários
    public List<Secretary> retrieve(String query) {
        List<Secretary> secretaries = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                secretaries.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return secretaries;
    }

    // Recupera todos os secretários
    public List<Secretary> retrieveAll() {
        return this.retrieve("SELECT * FROM Pessoa p JOIN Funcionario f ON p.cpf = f.cpf JOIN Secretario s ON f.cpf = s.cpf");
    }

    // Recupera secretário por ID
    public Secretary retrieveById(int id) {
        List<Secretary> secretaries = this.retrieve("SELECT * FROM Pessoa p JOIN Funcionario f ON p.cpf = f.cpf JOIN Secretario s ON f.cpf = s.cpf WHERE s.idSecretario = " + id);
        return (secretaries.isEmpty() ? null : secretaries.getFirst());
    }

    // Recupera secretário por CPF
    public Secretary retrieveByCpf(String cpf) {
        List<Secretary> secretaries = this.retrieve("SELECT * FROM Pessoa p JOIN Funcionario f ON p.cpf = f.cpf JOIN Secretario s ON f.cpf = s.cpf WHERE s.cpf = '" + cpf + "'");
        return (secretaries.isEmpty() ? null : secretaries.getFirst());
    }

    // UPDATE --------------------------------------
    public void update(Secretary secretary) {
        try {
            // Atualiza dados da tabela Pessoa
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Pessoa SET nome=?, endereco=?, telefone=?, email=? WHERE cpf=?");
            statement.setString(1, secretary.getName());
            statement.setString(2, secretary.getAddress());
            statement.setString(3, secretary.getPhone());
            statement.setString(4, secretary.getEmail());
            statement.setString(5, secretary.getCpf());
            executeUpdate(statement);

            // Atualiza dados da tabela Funcionario
            statement = DAO.getConnection().prepareStatement(
                    "UPDATE Funcionario SET login=?, senha=? WHERE cpf=?");
            statement.setString(1, secretary.getLogin());
            statement.setString(2, secretary.getPassword());
            statement.setString(3, secretary.getCpf());
            executeUpdate(statement);

            // Atualiza dados da tabela Secretario
            statement = DAO.getConnection().prepareStatement(
                    "UPDATE Secretario SET turno=? WHERE cpf=?");
            statement.setString(1, secretary.getWorkShift());
            statement.setString(2, secretary.getCpf());
            executeUpdate(statement);

        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Secretary secretary) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Secretario WHERE idSecretario = ?");
            statement.setInt(1, secretary.getSecretaryId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
