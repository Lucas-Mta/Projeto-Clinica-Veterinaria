package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VaccinationDAO extends DAO {

    private static VaccinationDAO instance;

    private VaccinationDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe VaccinationDAO
    public static VaccinationDAO getInstance() {
        return (instance == null ? (instance = new VaccinationDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Vaccination create(int vetId, int animalId, String vaccineName, String vaccineDate, String nextDose) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Vacinacao (idVeterinario, idAnimal, nomeVacina, data, proximaDose) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, vetId);
            statement.setInt(2, animalId);
            statement.setString(3, vaccineName);
            statement.setString(4, vaccineDate);
            statement.setString(5, nextDose);
            executeUpdate(statement);
        } catch (SQLException exception) {
            Logger.getLogger(VaccinationDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Vacinacao", "idVacinacao"));
    }


    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Vaccination buildObject(ResultSet resultSet) {
        Vaccination vaccination = null;
        try {
            vaccination = new Vaccination(
                    resultSet.getInt("idVacinacao"),
                    resultSet.getInt("idVeterinario"),
                    resultSet.getInt("idAnimal"),
                    resultSet.getString("nomeVacina"),
                    resultSet.getString("data"),
                    resultSet.getString("proximaDose")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return vaccination;
    }


    // RETRIEVE --------------------------------------
    // Recuperador geral de vacinações
    public List<Vaccination> retrieve(String query) {
        List<Vaccination> vaccinations = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                vaccinations.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return vaccinations;
    }

    // Recupera todas as vacinações
    public List<Vaccination> retrieveAll() {
        return this.retrieve("SELECT * FROM Vacinacao");
    }

    // Recupera vacinação por ID
    public Vaccination retrieveById(int id) {
        List<Vaccination> vaccinations = this.retrieve("SELECT * FROM Vacinacao WHERE idVacinacao = " + id);
        return (vaccinations.isEmpty() ? null : vaccinations.get(0));
    }

    // Recupera vacinações por ID do animal
    public List<Vaccination> retrieveByAnimalId(int animalId) {
        return this.retrieve("SELECT * FROM Vacinacao WHERE idAnimal = " + animalId);
    }

    // Recupera vacinações por ID do veterinário
    public List<Vaccination> retrieveByVetId(int vetId) {
        return this.retrieve("SELECT * FROM Vacinacao WHERE idVeterinario = " + vetId);
    }

    // Recupera a próxima vacinação do Animal
    public List<Vaccination> retrieveNextVacc(int animalId, String currentDate) {
        return this.retrieve(
                "SELECT * FROM Vacinacao WHERE idAnimal = " + animalId +
                 " AND proximaDose >= '" + currentDate + "' ORDER BY proximaDose DESC"
        );
    }

    // UPDATE --------------------------------------
    public void update(Vaccination vaccination) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Vacinacao SET idVeterinario=?, idAnimal=?, nomeVacina=?, data=?, proximaDose=? WHERE idVacinacao=?");
            statement.setInt(1, vaccination.getVetId());
            statement.setInt(2, vaccination.getAnimalId());
            statement.setString(3, vaccination.getVaccineName());
            statement.setString(4, vaccination.getVaccineDate());
            statement.setString(5, vaccination.getNextDose());
            statement.setInt(6, vaccination.getVaccinationId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }


    // DELETE --------------------------------------
    public void delete(Vaccination vaccination) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Vacinacao WHERE idVacinacao = ?");
            statement.setInt(1, vaccination.getVaccinationId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
