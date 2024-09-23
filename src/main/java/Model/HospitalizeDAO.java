package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HospitalizeDAO extends DAO {

    private static HospitalizeDAO instance;

    private HospitalizeDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe HospitalizeDAO
    public static HospitalizeDAO getInstance() {
        return (instance == null ? (instance = new HospitalizeDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Hospitalize create(int vetId, int animalId, String startDate, String progress) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Internacao (idVeterinario, idAnimal, dataInicio, dataFim, evolucao) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, vetId);
            statement.setInt(2, animalId);
            statement.setString(3, startDate);
            statement.setString(4, null);
            statement.setString(5, progress);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(HospitalizeDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Internacao", "idInternacao"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Hospitalize buildObject(ResultSet resultSet) {
        Hospitalize hospitalization = null;
        try {
            hospitalization = new Hospitalize(
                    resultSet.getInt("idInternacao"),
                    resultSet.getInt("idVeterinario"),
                    resultSet.getInt("idAnimal"),
                    resultSet.getString("dataInicio"),
                    resultSet.getString("dataFim"),
                    resultSet.getString("evolucao")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return hospitalization;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de internações
    public List<Hospitalize> retrieve(String query) {
        List<Hospitalize> hospitalizations = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                hospitalizations.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return hospitalizations;
    }

    // Recupera todas as internações
    public List<Hospitalize> retrieveAll() {
        return this.retrieve("SELECT * FROM Internacao");
    }

    // Recupera internação por ID
    public Hospitalize retrieveById(int id) {
        List<Hospitalize> hospitalizations = this.retrieve("SELECT * FROM Internacao WHERE idInternacao = " + id);
        return (hospitalizations.isEmpty() ? null : hospitalizations.getFirst());
    }

    // Recupera internação por ID do veterinário
    public List<Hospitalize> retrieveByVetId(int vetId) {
        return this.retrieve("SELECT * FROM Internacao WHERE idVeterinario = " + vetId);
    }

    // UPDATE --------------------------------------
    public void update(Hospitalize hospitalization) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Internacao SET idVeterinario=?, idAnimal=?, dataInicio=?, dataFim=?, evolucao=? WHERE idInternacao=?");
            statement.setInt(1, hospitalization.getVetId());
            statement.setInt(2, hospitalization.getAnimalId());
            statement.setString(3, hospitalization.getStartDate());
            statement.setString(4, hospitalization.getEndDate());
            statement.setString(5, hospitalization.getProgress());
            statement.setInt(6, hospitalization.getHospitalizationId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Hospitalize hospitalization) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Internacao WHERE idInternacao = ?");
            statement.setInt(1, hospitalization.getHospitalizationId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
