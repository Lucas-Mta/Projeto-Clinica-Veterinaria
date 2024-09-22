/*
* CLASSE RELATÓRIO (REPORT):
*
* Essa classe vai buscar informações do banco de dados.
* Por isso, ela vai interagir unicamente e diretamente com o DAO
* para realizar consultas específicas. Dessa forma, os dados vão ser
* obtidos dinamicamente quando foremacessados no banco.
*
* Em vez de armazenar as quantidades em atributos da classe,
* vão haver métodos que retornam os valores diretamente das consultas SQL.
*/

package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Report {

    private Connection connection;

    // Construtor que recebe a conexão do banco de dados
    public Report(Connection connection) {
        this.connection = connection;
    }

    // Metódo Geral para pegar a quantidade de algo
    public int getQuant(String query) throws SQLException {
        // Consulta SQL de acordo com a query
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();

        // Recupera a quantidade
        if (resultSet.next()) {
            return resultSet.getInt(1);
        }

        return 0;
    }

    // Pega a quantidade de Animais
    public int getQuantAnimals() throws SQLException {
        String query = "SELECT COUNT(*) FROM Animal;";
        return getQuant(query);
    }

    // Pega a quantidade de Clientes
    public int getQuantClients() throws SQLException {
        String query = "SELECT COUNT(*) FROM Cliente;";
        return getQuant(query);
    }

    // Pega a quantidade de Funcionários
    public int getQuantEmployees() throws SQLException {
        String query = "SELECT COUNT(*) FROM Funcionario;";
        return getQuant(query);
    }

    // Pega a quantidade de Veterinários
    public int getQuantVets() throws SQLException {
        String query = "SELECT COUNT(*) FROM Veterinario;";
        return getQuant(query);
    }

    // Pega a quantidade de Secretários
    public int getQuantSecrs() throws SQLException {
        String query = "SELECT COUNT(*) FROM Secretario;";
        return getQuant(query);
    }

    // Pega a quantidade de Medicamentos
    public int getQuantMedicines() throws SQLException {
        String query = "SELECT COUNT(*) FROM Medicamento;";
        return getQuant(query);
    }

    // Pega a quantidade de Tratamentos em andamento
    public int getQuantTreatments() throws SQLException {
        String query = "SELECT COUNT(*) FROM Tratamento WHERE encerrado = false;";
        return getQuant(query);
    }



    // Exibe o relatório completo
    public void showInfos() throws SQLException {
        System.out.println("Relatório de Informações: ");
        System.out.println("Quantidade de Clientes: " + getQuantClients());
        System.out.println("Quantidade de Funcionários: " + getQuantEmployees());
        System.out.println("Quantidade de Secretários(as): " + getQuantSecrs());
        System.out.println("Quantidade de Veterinários(as): " + getQuantVets());
        System.out.println("Quantidade de Animais: " + getQuantAnimals());
        System.out.println("Quantidade de Tratamentos em andamento: " + getQuantTreatments());
        System.out.println("Quantidade de Medicamentos: " + getQuantMedicines());
    }

}