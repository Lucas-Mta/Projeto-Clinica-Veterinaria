package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpeciesDAO extends DAO {

    private static SpeciesDAO instance;

    private SpeciesDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe SpeciesDAO
    public static SpeciesDAO getInstance() {
        return (instance == null ? (instance = new SpeciesDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Species create(String specieName) {
        try {
            // Inserir na tabela Species
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Especie (nomeEspecie) VALUES (?)");
            statement.setString(1, specieName);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(SpeciesDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Especie", "idEspecie"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Species buildObject(ResultSet resultSet) {
        Species species = null;
        try {
            species = new Species(
                    resultSet.getInt("especieId"),
                    resultSet.getString("nomeEspecie")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return species;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de espécies
    public List<Species> retrieve(String query) {
        List<Species> speciesList = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                speciesList.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return speciesList;
    }

    // Recupera todas as espécies
    public List<Species> retrieveAll() {
        return this.retrieve("SELECT * FROM Especie");
    }

    // Recupera espécie por ID
    public Species retrieveById(int id) {
        List<Species> speciesList = this.retrieve("SELECT * FROM Especie WHERE idEspecie = " + id);
        return (speciesList.isEmpty() ? null : speciesList.get(0));
    }

    // Recupera espécie por nome
    public List<Species> retrieveByName(String specieName) {
        return this.retrieve("SELECT * FROM Especie WHERE nomeEspecie LIKE '%" + specieName + "%'");
    }

    // UPDATE --------------------------------------
    public void update(Species species) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Especie SET nomeEspecie=? WHERE idEspecie=?");
            statement.setString(1, species.getSpecieName());
            statement.setInt(2, species.getSpecieId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Species species) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Especie WHERE idEspecie = ?");
            statement.setInt(1, species.getSpecieId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
