package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreatmentDAO extends DAO {

    private static TreatmentDAO instance;

    private TreatmentDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe TreatmentDAO
    public static TreatmentDAO getInstance() {
        return (instance == null ? (instance = new TreatmentDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Treatment create(int animalId, Date startDate, Date endDate, String description) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Tratamento (idAnimal, dataInicial, dataFinal, descricao, encerrado) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, animalId);
            statement.setDate(2, new java.sql.Date(startDate.getTime()));
            statement.setDate(3, new java.sql.Date(endDate.getTime()));
            statement.setString(4, description);
            statement.setBoolean(5, false); // Tratamento em andamento
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(TreatmentDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Tratamento", "idTratamento"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Treatment buildObject(ResultSet resultSet) {
        Treatment treatment = null;
        try {
            treatment = new Treatment(
                    resultSet.getInt("idTratamento"),
                    resultSet.getInt("idAnimal"),
                    resultSet.getDate("dataInicial"),
                    resultSet.getDate("dataFinal"),
                    resultSet.getString("descricao"),
                    resultSet.getBoolean("encerrado")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return treatment;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de tratamentos
    public List<Treatment> retrieve(String query) {
        List<Treatment> treatments = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                treatments.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return treatments;
    }

    // Recupera todos os tratamentos
    public List<Treatment> retrieveAll() {
        return this.retrieve("SELECT * FROM Tratamento");
    }

    // Recupera tratamento por ID
    public Treatment retrieveById(int id) {
        List<Treatment> treatments = this.retrieve("SELECT * FROM Tratamento WHERE idTratamento = " + id);
        return (treatments.isEmpty() ? null : treatments.getFirst());
    }

    // Recupera tratamentos por ID do animal
    public List<Treatment> retrieveByAnimalId(int animalId) {
        return this.retrieve("SELECT * FROM Tratamento WHERE idAnimal = " + animalId);
    }

    // UPDATE --------------------------------------
    public void update(Treatment treatment) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Tratamento SET idAnimal=?, dataInicial=?, dataFinal=?, descricao=?, encerrado=? WHERE idTratamento=?");
            statement.setInt(1, treatment.getAnimalId());
            statement.setDate(2, new java.sql.Date(treatment.getStartDate().getTime()));
            statement.setDate(3, new java.sql.Date(treatment.getEndDate().getTime()));
            statement.setString(4, treatment.getDescription());
            statement.setBoolean(5, treatment.isFinished());
            statement.setInt(6, treatment.getTreatmentId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Treatment treatment) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Tratamento WHERE idTratamento = ?");
            statement.setInt(1, treatment.getTreatmentId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
