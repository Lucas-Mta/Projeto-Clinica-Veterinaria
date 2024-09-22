package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppointmentDAO extends DAO {

    private static AppointmentDAO instance;

    private AppointmentDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe AppointmentDAO
    public static AppointmentDAO getInstance() {
        return (instance == null ? (instance = new AppointmentDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Appointment create(Date date, Time hour, int animalId, int vetId, int treatmentId, String symptoms) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Consulta (data, hora, idAnimal, idVeterinario, idTratamento, sintomas) "
                            + "VALUES (?, ?, ?, ?, ?, ?)");
            statement.setDate(1, date);
            statement.setTime(2, hour);
            statement.setInt(3, animalId);
            statement.setInt(4, vetId);
            statement.setInt(5, treatmentId);
            statement.setString(6, symptoms);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(AppointmentDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Consulta", "idConsulta"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Appointment buildObject(ResultSet resultSet) {
        Appointment appointment = null;
        try {
            appointment = new Appointment(resultSet.getInt("idConsulta"),
                    resultSet.getDate("data"),
                    resultSet.getTime("hora"),
                    resultSet.getInt("idAnimal"),
                    resultSet.getInt("idVeterinario"),
                    resultSet.getInt("idTratamento"),
                    resultSet.getString("sintomas"));

        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return appointment;
    }


    // RETRIEVE --------------------------------------
    // Recuperador geral de consultas
    public List<Appointment> retrieve(String query) {
        List<Appointment> appointments = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                appointments.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return appointments;
    }

    // Recupera todas as consultas
    public List<Appointment> retrieveAll() {
        return this.retrieve("SELECT * FROM Consulta");
    }

    // Recupera por Id da consulta
    public Appointment retrieveById(int id) {
        List<Appointment> appointments = this.retrieve("SELECT * FROM Consulta WHERE idConsulta = " + id);
        return (appointments.isEmpty() ? null : appointments.getFirst());
    }

    // Recupera por Id do Veterinário
    public List<Appointment> retrieveByVetId(int vetId) {
        return this.retrieve("SELECT * FROM Consulta WHERE idVeterinario = " + vetId);
    }

    // Recupera por Id do Animal
    public List<Appointment> retrieveByAnimalId(int animalId) {
        return this.retrieve("SELECT * FROM Consulta WHERE idAnimal = " + animalId);
    }


    // UPDATE --------------------------------------
    public void update(Appointment appointment) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Consulta SET data=?, hora=?, idAnimal=?, idVeterinario=?, idTratamento=?, sintomas=? WHERE idConsulta=?");
            statement.setDate(1, appointment.getDate());
            statement.setTime(2, appointment.getHour());
            statement.setInt(3, appointment.getAnimalId());
            statement.setInt(4, appointment.getVetId());
            statement.setInt(5, appointment.getTreatmentId());
            statement.setString(6, appointment.getSymptoms());
            statement.setInt(7, appointment.getAppointmentId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }


    // DELETE --------------------------------------
    public void delete(Appointment appointment) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Consulta WHERE idConsulta = ?");
            statement.setInt(1, appointment.getAppointmentId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

}
