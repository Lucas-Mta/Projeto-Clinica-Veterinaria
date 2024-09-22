package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AnimalDAO extends DAO {

    private static AnimalDAO instance;

    private AnimalDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe AnimalDAO
    public static AnimalDAO getInstance() {
        return (instance == null ? (instance = new AnimalDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Animal create(String name, int age, char gender, Double weight, int ownerId, int specieId) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
            "INSERT INTO Animal (nome, idade, sexo, peso, idProprietario, idEspecie) "
            + "VALUES (?, ?, ?, ?, ?, ?)");
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.setString(3, String.valueOf(gender));
            statement.setDouble(4, weight);
            statement.setInt(5, ownerId);
            statement.setInt(6, specieId);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(AnimalDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Animal", "idAnimal"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Animal buildObject(ResultSet resultSet) {
        Animal animal = null;
        try {
            animal = new Animal(resultSet.getInt("idAnimal"),
                                resultSet.getString("nome"),
                                resultSet.getInt("idade"),
                                resultSet.getString("sexo").charAt(0),
                                resultSet.getDouble("peso"),
                                resultSet.getInt("idProprietario"),
                                resultSet.getInt("idEspecie"));

        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return animal;
    }


    // RETRIEVE --------------------------------------
    // Recuperador geral de animais
    public List<Animal> retrieve(String query) {
        List<Animal> animals = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                animals.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return animals;
    }

    // Recupera todos os animais
    public List<Animal> retrieveAll() {
        return this.retrieve("SELECT * FROM Animal");
    }

    // Recupera por Id do animal
    public Animal retrieveById(int id) {
        List<Animal> animals = this.retrieve("SELECT * FROM Animal WHERE idAnimal = " + id);
        return (animals.isEmpty() ? null : animals.getFirst());
    }

    // Recupera por Id do Dono
    public List<Animal> retrieveByOwnerId(int ownerId) {
        return this.retrieve("SELECT * FROM Animal WHERE idProprietario = " + ownerId);
    }

    // Recupera por Nome parecido
    public List<Animal> retrieveBySimilarName(String name) {
        return this.retrieve("SELECT * FROM Animal WHERE nome LIKE '%" + name + "%'");
    }


    // UPDATE --------------------------------------
    public void update(Animal animal) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Animal SET nome=?, idade=?, sexo=?, peso=?, idProprietario=?, "
                            + "idEspecie=? WHERE idAnimal=?");
            statement.setInt(2, animal.getAge());
            statement.setString(3, String.valueOf(animal.getGender()));
            statement.setDouble(4, animal.getWeight());
            statement.setInt(5, animal.getOwnerId());
            statement.setString(1, animal.getName());
            statement.setInt(6, animal.getSpecieId());
            statement.setInt(7, animal.getAnimalId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }


    // DELETE --------------------------------------
    public void delete(Animal animal) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Animal WHERE idAnimal = ?");
            statement.setInt(1, animal.getAnimalId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

}


