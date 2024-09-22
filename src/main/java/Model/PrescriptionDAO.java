package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrescriptionDAO extends DAO {

    private static PrescriptionDAO instance;

    private PrescriptionDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe PrescriptionDAO
    public static PrescriptionDAO getInstance() {
        return (instance == null ? (instance = new PrescriptionDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Prescription create(int vetId, int appointmentId, int drugId, String healthProblem, float dosage, String instructions) {
        try {
            // Inserir na tabela Prescription
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Prescricao (idVeterinario, idConsulta, idMedicamento, problemaSaude, dosagem, instrucoes) "
                            + "VALUES (?, ?, ?, ?, ?, ?)");
            statement.setInt(1, vetId);
            statement.setInt(2, appointmentId);
            statement.setInt(3, drugId);
            statement.setString(4, healthProblem);
            statement.setFloat(5, dosage);
            statement.setString(6, instructions);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(PrescriptionDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Prescricao", "idPrescricao"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Prescription buildObject(ResultSet resultSet) {
        Prescription prescription = null;
        try {
            prescription = new Prescription(
                    resultSet.getInt("idPrescricao"),
                    resultSet.getInt("idVeterinario"),
                    resultSet.getInt("idConsulta"),
                    resultSet.getInt("idMedicamento"),
                    resultSet.getString("problemaSaude"),
                    resultSet.getFloat("dosagem"),
                    resultSet.getString("instrucoes")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return prescription;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de prescrições
    public List<Prescription> retrieve(String query) {
        List<Prescription> prescriptions = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                prescriptions.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return prescriptions;
    }

    // Recupera todas as prescrições
    public List<Prescription> retrieveAll() {
        return this.retrieve("SELECT * FROM Prescricao");
    }

    // Recupera prescrição por ID
    public Prescription retrieveById(int id) {
        List<Prescription> prescriptions = this.retrieve("SELECT * FROM Prescricao WHERE idPrescricao = " + id);
        return (prescriptions.isEmpty() ? null : prescriptions.getFirst());
    }

    // Recupera prescrições por ID do veterinário
    public List<Prescription> retrieveByVetId(int vetId) {
        return this.retrieve("SELECT * FROM Prescricao WHERE idVeterinario = " + vetId);
    }

    // UPDATE --------------------------------------
    public void update(Prescription prescription) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Prescricao SET idVeterinario=?, idConsulta=?, idMedicamento=?, problemaSaude=?, dosagem=?, " +
                            "instrucoes=? WHERE idPrescricao=?");
            statement.setInt(1, prescription.getVetId());
            statement.setInt(2, prescription.getAppointmentId());
            statement.setInt(3, prescription.getDrugId());
            statement.setString(4, prescription.getHealthProblem());
            statement.setFloat(5, prescription.getDosage());
            statement.setString(6, prescription.getInstructions());
            statement.setInt(7, prescription.getPrescriptionId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Prescription prescription) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Prescricao WHERE idPrescricao = ?");
            statement.setInt(1, prescription.getPrescriptionId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
