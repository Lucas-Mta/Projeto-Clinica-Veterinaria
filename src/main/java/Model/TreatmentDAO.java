package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
    public Treatment create(int animalId, String startDate, String description) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Tratamento (idAnimal, dataInicial, dataFinal, descricao, encerrado) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, animalId);
            statement.setString(2, startDate);
            statement.setString(3, null); // null por padrão
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
                    resultSet.getString("dataInicial"),
                    resultSet.getString("dataFinal"),
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

    // Recupera os tratamentos não finalizados de um animal
    public List<Treatment> retrieveUnfinishedTreatments(int animalId) {
        return this.retrieve(
                "SELECT * FROM Tratamento WHERE idAnimal = " + animalId
                + " AND encerrado = 0"
        );
    }

    // UPDATE --------------------------------------
    public void update(Treatment treatment) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Tratamento SET idAnimal=?, dataInicial=?, dataFinal=?, descricao=?, encerrado=? WHERE idTratamento=?");
            statement.setInt(1, treatment.getAnimalId());
            statement.setString(2, treatment.getStartDate());
            statement.setString(3, treatment.getEndDate());
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
