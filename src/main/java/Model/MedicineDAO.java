package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MedicineDAO extends DAO {

    private static MedicineDAO instance;

    private MedicineDAO() {
        getConnection();
        createTable();
    }

    // Singleton - Mantém uma única instância da classe MedicineDAO
    public static MedicineDAO getInstance() {
        return (instance == null ? (instance = new MedicineDAO()) : instance);
    }

    // OPERAÇÕES CRUD

    // CREATE --------------------------------------
    public Medicine create(String name, int minStock) {
        try {
            // Inserir na tabela Medicine
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "INSERT INTO Medicamento (nome, estoqueMinimo) VALUES (?, ?)");
            statement.setString(1, name);
            statement.setInt(2, minStock);
            executeUpdate(statement);

        } catch (SQLException exception) {
            Logger.getLogger(MedicineDAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return this.retrieveById(lastId("Medicamento", "idMedicamento"));
    }

    // Criando um objeto a partir de um ResultSet do Banco de Dados
    private Medicine buildObject(ResultSet resultSet) {
        Medicine medicine = null;
        try {
            medicine = new Medicine(
                    resultSet.getInt("idMedicamento"),
                    resultSet.getString("nome"),
                    resultSet.getInt("estoqueMinimo")
            );
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return medicine;
    }

    // RETRIEVE --------------------------------------
    // Recuperador geral de medicamentos
    public List<Medicine> retrieve(String query) {
        List<Medicine> medicines = new ArrayList<>();
        ResultSet resultSet = getResultSet(query);
        try {
            while (resultSet.next()) {
                medicines.add(buildObject(resultSet));
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return medicines;
    }

    // Recupera todos os medicamentos
    public List<Medicine> retrieveAll() {
        return this.retrieve("SELECT * FROM Medicamento");
    }

    // Recupera medicamento por ID
    public Medicine retrieveById(int id) {
        List<Medicine> medicines = this.retrieve("SELECT * FROM Medicamento WHERE idMedicamento = " + id);
        return (medicines.isEmpty() ? null : medicines.getFirst());
    }

    // Recupera medicamento por nome
    public List<Medicine> retrieveByName(String name) {
        return this.retrieve("SELECT * FROM Medicamento WHERE nome LIKE '%" + name + "%'");
    }

    // UPDATE --------------------------------------
    public void update(Medicine medicine) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "UPDATE Medicamento SET nome=?, estoqueMinimo=? WHERE idMedicamento=?");
            statement.setString(1, medicine.getName());
            statement.setInt(2, medicine.getMinStock());
            statement.setInt(3, medicine.getDrugId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // DELETE --------------------------------------
    public void delete(Medicine medicine) {
        try {
            PreparedStatement statement = DAO.getConnection().prepareStatement(
                    "DELETE FROM Medicamento WHERE idMedicamento = ?");
            statement.setInt(1, medicine.getDrugId());
            executeUpdate(statement);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }
}
