package Model;

/* DAO Implementation
 *
 * @author: Lucas de Jesus Mota Ferreira - luccas.mta@gmail.com
 *
 */

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO {
    public static String URL = "";
    private static Connection connection;
    protected static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

    // Connect to SQLite
    public static Connection getConnection() {
        if (connection ==  null) {
            try {
                connection = DriverManager.getConnection(URL);
                if (connection != null) {
                    DatabaseMetaData meta = connection.getMetaData();
                }
            } catch (SQLException exception) {
                System.err.println("Erro: " + exception.getMessage());
            }
        }
        return connection;
    }

    /* Pega o resultado no banco de dados de uma query especificada */
    protected ResultSet getResultSet(String query) {
        Statement statement; // Declaração
        ResultSet resultSet = null; // Resultados
        try {
            statement = (Statement) connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return resultSet;
    }

    //?????
    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        int update;
        update = queryStatement.executeUpdate();
        return update;
    }

    // Pega o último id
    protected int lastId(String tableName, String primaryKey) {
        Statement statement;
        int lastId = -1;
        try {
            statement = (Statement) connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT MAX(" + primaryKey + ") AS id FROM" + tableName);
            if (resultSet.next()) {
                lastId = resultSet.getInt("id");
            }
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
        return lastId;
    }

    // Encerra conexão com o banco
    public static void endConecction() {
        try {
            (DAO.getConnection()).close();
        } catch (SQLException exception) {
            System.err.println("Erro: " + exception.getMessage());
        }
    }

    // Cria tabela SQLite
    protected final boolean createTable() {
        // Criação de tabelas e seus atributos.
        try {
            PreparedStatement statement;

            // Tabela pessoa
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS pessoa(\s
                    cpf VARCHAR PRIMARY KEY,\s
                    nome VARCHAR,\s
                    endereco VARCHAR,\s
                    telefone VARCHAR,\s
                    email VARCHAR\s
                    );""");
            executeUpdate(statement);

            // Tabela funcionário
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS funcionario(\s
                    idLogin INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    login VARCHAR,\s
                    senha VARCHAR,\s
                    nivelAcesso INTEGER\s
                    );""");
            executeUpdate(statement);

            // Tabela Cliente (herda de pessoa)
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS cliente(\s
                    idCliente INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    cpf VARCHAR,\s
                    FOREIGN KEY(cpf) REFERENCES pessoa(cpf)\s
                    );""");
            executeUpdate(statement);

            // Tabela Secretária (herda de funcionário)
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS secretaria(\s
                    idSecretaria INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    turno VARCHAR,\s
                    idLogin INTEGER,\s
                    FOREING KEY(idLogin) REFERENCES funcionario(idLogin)\s
                    );""");
            executeUpdate(statement);

            // Tabela Veterinário (herda de funcionário)
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS veterinario (\s
                    idVeterinario INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    especialidade VARCHAR,\s
                    horaAtendimento TIME,\s
                    numSala INTEGER,\s
                    idLogin INTEGER,\s
                    FOREING KEY(idLogin) REFERENCES funcionario(idLogin)\s
                    );""");
            executeUpdate(statement);

            // Tabela Animal
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS animal(\s
                    idAnimal INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    nome VARCHAR,\s
                    idade INTEGER \s
                    sexo CHAR,\s
                    peso DOUBLE,\s
                    cpfProprietario VARCHAR,\s
                    idEspecie INTEGER,\s
                    FOREIGN KEY(cpfProprietario) REFERENCES cliente(cpf),\s
                    FOREIGN KEY(idEspecie) REFERENCES especie(idEspecie)\s
                    );""");
            executeUpdate(statement);

            // Tabela Especie
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS especie(\s
                    idEspecie INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    nomeEspecie VARCHAR\s
                    );""");
            executeUpdate(statement);

            // Tabela Internacao
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS internacao(\s
                    idInternacao INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    idVeterinario INTEGER,\s
                    idAnimal INTEGER,\s
                    dataInicio DATE,\s
                    dataFim DATE,\s
                    evolucao VARCHAR,\s
                    FOREIGN KEY(idVeterinario) REFERENCES veterinario(idVeterinario),\s
                    FOREIGN KEY(idAnimal) REFERENCES animal(idAnimal)\s
                    );""");
            executeUpdate(statement);

            // Tabela Vacinacao
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS vacinacao(\s
                    idVacinacao INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    idVeterinario INTEGER,\s
                    idAnimal INTEGER,\s
                    vacina VARCHAR,\s
                    data DATE,\s
                    proximaDose DATE,\s
                    FOREIGN KEY(idVeterinario) REFERENCES veterinario(idVeterinario),\s
                    FOREIGN KEY(idAnimal) REFERENCES animal(idAnimal)\s
                    );""");
            executeUpdate(statement);

            // Tabela Tratamento
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS tratamento(\s
                    idTratamento INTEGER PRIMARY KEY AUTOINCREMENT, \s
                    idAnimal INTEGER, \s
                    dataInicio DATE, \s
                    dataFim DATE, \s
                    descricao VARCHAR, \s
                    FOREING KEY(idAnimal) REFERENCES animal(idAnimal) \s
                    );""");
                    // como colocar o atributo finalizado aqui??
            executeUpdate(statement);

            // Tabela Consulta
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS consulta(\s
                    idConsulta INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    data DATE,\s
                    hora TIME,\s
                    idAnimal INTEGER,\s
                    idVeterinario INTEGER,\s
                    idTratamento INTEGER, \s
                    sintomas VARCHAR,\s
                    FOREIGN KEY(idAnimal) REFERENCES animal(idAnimal),\s
                    FOREIGN KEY(idVeterinario) REFERENCES veterinario(idVeterinario)\s
                    FOREING KEY(idTratamento) REFERENCES tratamento(idTratamento), \s
                    );""");
            executeUpdate(statement);

            // Tabela Exame
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS exame(\s
                    idExame INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    tipo VARCHAR,\s
                    idConsulta INTEGER,\s
                    descricaoExame VARCHAR,\s
                    dataSolicitacao DATE,\s
                    status VARCHAR,\s
                    resultados VARCHAR,\s
                    FOREIGN KEY(idConsulta) REFERENCES consulta(idConsulta)\s
                    );""");
            executeUpdate(statement);

            // Tabela Prescricao
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS prescricao(\s
                    idPrescricao INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    idVeterinario INTEGER,\s
                    idConsulta INTEGER,\s
                    idMedicamento INTEGER,\s
                    problemaSaude VARCHAR,\s
                    dosagem INTEGER,\s
                    instrucoes VARCHAR,\s
                    FOREIGN KEY(idVeterinario) REFERENCES veterinario(idVeterinario),\s
                    FOREIGN KEY(idConsulta) REFERENCES consulta(idConsulta),\s
                    FOREIGN KEY(idMedicamento) REFERENCES medicamento(idMedicamento)\s
                    );""");
            executeUpdate(statement);

            // Tabela Medicamento
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS medicamento(\s
                    idMedicamento INTEGER PRIMARY KEY AUTOINCREMENT,\s
                    nome VARCHAR,\s
                    estoqueMinimo INTEGER\s
                    );""");
            executeUpdate(statement);

            return true;
        } catch (SQLException exception) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, exception);
        }
        return false;
    }

}
