package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpecieDAO extends DAO {

    private static SpecieDAO instance;

    private SpecieDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe SpecieDAO
    public static SpecieDAO getInstance() {
        return (instance == null ? (instance = new SpecieDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Specie create(String specieName) {
        try {
            // Inserir na tabela Specie
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Especie (nomeEspecie) VALUES (?)");
            statement.setString(1, specieName);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(SpecieDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Especie", "idEspecie"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Specie buildObject(ResultSet resultSet) {
        Specie specie = null;
        try {
            specie = new Specie(
                    resultSet.getInt("idEspecie"),
                    resultSet.getString("nomeEspecie")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return specie;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de espécies
    public List<Specie> retrieve(String query) {
        List<Specie> specieList = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                specieList.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return specieList;
    }

    // Recupera todas as espécies
    public List<Specie> retrieveAll() {
        return this.retrieve("SELECT * FROM Especie");
    }

    // Recupera espécie por ID
    public Specie retrieveById(int id) {
        List<Specie> specieList = this.retrieve("SELECT * FROM Especie WHERE idEspecie = " + id);
        return (specieList.isEmpty() ? null : specieList.get(0));
    }

    // Recupera espécie por nome
    public List<Specie> retrieveByName(String specieName) {
        return this.retrieve("SELECT * FROM Especie WHERE nomeEspecie LIKE '%" + specieName + "%'");
    }

    // UPDATE --------------------------------------
    public void update(Specie specie) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Especie SET nomeEspecie=? WHERE idEspecie=?");
            statement.setString(1, specie.getSpecieName());
            statement.setInt(2, specie.getSpecieId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Specie specie) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Especie WHERE idEspecie = ?");
            statement.setInt(1, specie.getSpecieId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
