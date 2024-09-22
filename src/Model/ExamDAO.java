package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamDAO extends DAO {

    private static ExamDAO instance;

    private ExamDAO() {
        getConnection();
        createTable();
    }

    // Singleton
    public static ExamDAO getInstance() {
        return (instance == null ? (instance = new ExamDAO()) : instance);
    }

    // CRUD

    // Create
    public Exam create(int appointmentId, String examType, String description, Date requestDate, String status, String results) {
        try {
            PreparedStatement statement;
            statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Exame (idConsulta, tipo, descricao, dataSolicitacao, status, resultados) VALUES (?,?,?,?,?,?)");
            statement.setInt(1, appointmentId);
            statement.setString(2, examType);
            statement.setString(3, description);
            statement.setDate(4, new java.sql.Date(requestDate.getTime()));
            statement.setString(5, status);
            statement.setString(6, results);
            executeUpdate(statement);
        } catch (SQLException exception) {
            Logger.getLogger(ExamDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Exame", "idExame"));
    }

    // Build object from ResultSet
    private Exam buildObject(ResultSet resultSet) {
        Exam exam = null;
        try {
            exam = new Exam(
                    resultSet.getInt("idExame"),
                    resultSet.getInt("idConsulta"),
                    resultSet.getString("tipo"),
                    resultSet.getString("descricao"),
                    resultSet.getDate("dataSolicitacao"),
                    resultSet.getString("status"),
                    resultSet.getString("resultados"));
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return exam;
    }

    // Generic Retriever
    public List<Exam> retrieve(String query) {
        List<Exam> exams = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                exams.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return exams;
    }

    // Retrieve all exams
    public List<Exam> retrieveAll() {
        return this.retrieve("SELECT * FROM Exame");
    }

    // Retrieve exam by ID
    public Exam retrieveById(int id) {
        List<Exam> exams = this.retrieve("SELECT * FROM Exame WHERE idExame = " + id);
        return (exams.isEmpty() ? null : exams.getFirst());
    }

    // Retrieve by similar exam type
    public List<Exam> retrieveBySimilarType(String examType) {
        return this.retrieve("SELECT * FROM Exame WHERE tipo LIKE '%" + examType + "%'");
    }

    // Update
    public void update(Exam exam) {
        try {
            PreparedStatement statement;
            statement = DAO.getConnection().prepareStatement(
                    "UPDATE Exame SET idConsulta=?, tipo=?, descricao=?, dataSolicitacao=?, status=?, resultados=? WHERE idExame=?");
            statement.setInt(1, exam.getAppointmentId());
            statement.setString(2, exam.getExamType());
            statement.setString(3, exam.getDescription());
            statement.setDate(4, new java.sql.Date(exam.getRequestDate().getTime()));
            statement.setString(5, exam.getStatus());
            statement.setString(6, exam.getResults());
            statement.setInt(7, exam.getExamId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // Delete
    public void delete(Exam exam) {
        PreparedStatement statement;
        try {
            statement = DAO.getConnection().prepareStatement("DELETE FROM Exame WHERE idExame = ?");
            statement.setInt(1, exam.getExamId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
