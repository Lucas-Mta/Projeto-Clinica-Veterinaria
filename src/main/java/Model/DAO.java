package Model;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO {
    public static String URL = "jdbc:sqlite:./clinicaVeterinaria.db";
    private static Connection connection;

    // Conecta ao SQL
    public static Connection getConnection() {
        if (connection ==  null) {
            try {
                connection = DriverManager.getConnection(URL);
                if (connection != null) {
                    DatabaseMetaData meta = connection.getMetaData();
                    System.out.println("Conectando ao banco de dados: " + meta.getDriverName());
                }
            } catch (SQLException exception) {
                System.err.println("Erro de conexão: " + exception.getMessage());
            }
        }
        return connection;
    }

    // Executa uma consulta de SELECT e retorna o ResultSet
    protected ResultSet getResultSet(String query) {
        try {
            Statement statement = connection.createStatement();
            return statement.executeQuery(query);
        } catch (SQLException exception) {
            System.err.println("Erro na consulta: " + exception.getMessage());
        }
        return null;
    }

    // Executa uma atualização no banco de dados (INSERT, UPDATE, DELETE)
    protected int executeUpdate(PreparedStatement queryStatement) throws SQLException {
        return queryStatement.executeUpdate();
    }

    // Recupera o último ID inserido em uma tabela específica
    protected int lastId(String tableName, String primaryKey) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT MAX(" + primaryKey + ") AS id FROM " + tableName);
            if (resultSet.next()) {
                return resultSet.getInt("id");
            }
        } catch (SQLException exception) {
            System.err.println("Erro ao obter o último ID: " + exception.getMessage());
        }
        return -1;
    }

    // Encerra conexão com o banco de dados
    public static void endConecction() {
        try {
            if (!connection.isClosed() && connection != null) {
                connection.close();
                System.out.println("Conexão encerrada com o banco de dados.");
            }
        } catch (SQLException exception) {
            System.err.println("Erro ao fechar a conexão: " + exception.getMessage());
        }
    }

    // Cria todas as tabelas necessárias no banco de dados
    protected final boolean createTable() {
        try {
            PreparedStatement statement;

            // Tabela Pessoa
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Pessoa (
                cpf VARCHAR(11) PRIMARY KEY,
                nome VARCHAR(80) NOT NULL,
                endereco VARCHAR(100),
                telefone VARCHAR(11),
                email VARCHAR(60) UNIQUE
                );""");
            executeUpdate(statement);

            // Tabela Funcionário
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Funcionario (
                cpf VARCHAR PRIMARY KEY,
                nivelAcesso INTEGER NOT NULL,
                login VARCHAR UNIQUE NOT NULL,
                senha VARCHAR NOT NULL,
                FOREIGN KEY(cpf) REFERENCES Pessoa(cpf),
                CHECK (nivelAcesso == 0 || nivelAcesso == 1)
                );""");
            executeUpdate(statement);

            // Tabela Secretária (herda de Funcionário)
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Secretario (
                idSecretario INTEGER PRIMARY KEY AUTOINCREMENT,
                cpf VARCHAR UNIQUE NOT NULL,
                turno VARCHAR NOT NULL,
                FOREIGN KEY(cpf) REFERENCES Funcionario(cpf)
                );""");
            executeUpdate(statement);

            // Tabela Veterinário (herda de Funcionário)
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Veterinario (
                idVeterinario INTEGER PRIMARY KEY AUTOINCREMENT,
                cpf VARCHAR UNIQUE NOT NULL,
                especialidade VARCHAR NOT NULL,
                horaAtendimento VARCHAR NOT NULL,
                numSala INTEGER NOT NULL,
                FOREIGN KEY(cpf) REFERENCES Funcionario(cpf)
                );""");
            executeUpdate(statement);

            // Tabela Cliente (herda de Pessoa)
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Cliente (
                idCliente INTEGER PRIMARY KEY AUTOINCREMENT,
                cpf VARCHAR UNIQUE NOT NULL,
                FOREIGN KEY(cpf) REFERENCES Pessoa(cpf)
                );""");
            executeUpdate(statement);

            // Tabela Espécie
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Especie (\s
                idEspecie INTEGER PRIMARY KEY AUTOINCREMENT,\s
                nomeEspecie VARCHAR UNIQUE NOT NULL\s
                );""");
            executeUpdate(statement);

            // Tabela Animal
            statement = DAO.getConnection().prepareStatement("""
                CREATE TABLE IF NOT EXISTS Animal (
                idAnimal INTEGER PRIMARY KEY AUTOINCREMENT,
                nome VARCHAR NOT NULL,
                idade INTEGER,
                sexo CHAR(1),
                peso DOUBLE,
                idProprietario INTEGER NOT NULL,
                idEspecie INTEGER NOT NULL,
                FOREIGN KEY(idProprietario) REFERENCES Cliente(idCliente),
                FOREIGN KEY(idEspecie) REFERENCES Especie(idEspecie)
                );""");
            executeUpdate(statement);

            // Tabela Tratamento
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Tratamento (
                    idTratamento INTEGER PRIMARY KEY AUTOINCREMENT,
                    idAnimal INTEGER NOT NULL,
                    dataInicial VARCHAR NOT NULL,
                    dataFinal VARCHAR NULL,
                    descricao VARCHAR,
                    encerrado BOOLEAN DEFAULT FALSE,
                    FOREIGN KEY(idAnimal) REFERENCES Animal(idanimal)
                    );""");
            executeUpdate(statement);

            // Tabela Consulta
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Consulta (
                    idConsulta INTEGER PRIMARY KEY AUTOINCREMENT,
                    data VARCHAR NOT NULL,
                    hora VARCHAR NOT NULL,
                    idAnimal INTEGER NOT NULL,
                    idVeterinario INTEGER NOT NULL,
                    idTratamento INTEGER NOT NULL,
                    sintomas VARCHAR,
                    FOREIGN KEY(idAnimal) REFERENCES Animal(idanimal),
                    FOREIGN KEY(idVeterinario) REFERENCES Veterinario(idVeterinario),
                    FOREIGN KEY(idTratamento) REFERENCES Tratamento(idtratamento)
                    );""");
            executeUpdate(statement);

            // Tabela Exame
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Exame (
                    idExame INTEGER PRIMARY KEY AUTOINCREMENT,
                    idConsulta INTEGER NOT NULL,
                    tipo VARCHAR NOT NULL,
                    descricao VARCHAR,
                    dataSolicitacao VARCHAR NOT NULL,
                    status VARCHAR NOT NULL,
                    resultados VARCHAR,
                    FOREIGN KEY(idConsulta) REFERENCES Consulta(idconsulta)
                    );""");
            executeUpdate(statement);

            // Tabela Medicamento
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Medicamento (
                    idMedicamento INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome VARCHAR NOT NULL,
                    estoqueMinimo INTEGER NOT NULL
                    );""");
            executeUpdate(statement);

            // Tabela Prescrição
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Prescricao (
                    idPrescricao INTEGER PRIMARY KEY AUTOINCREMENT,
                    idVeterinario INTEGER NOT NULL,
                    idConsulta INTEGER NOT NULL,
                    idMedicamento INTEGER NOT NULL,
                    problemaSaude VARCHAR NOT NULL,
                    dosagem FLOAT NOT NULL,
                    instrucoes VARCHAR NOT NULL,
                    FOREIGN KEY(idVeterinario) REFERENCES Veterinario(idveterinario),
                    FOREIGN KEY(idConsulta) REFERENCES Consulta(idconsulta),
                    FOREIGN KEY(idMedicamento) REFERENCES Medicamento(idmedicamento)
                    );""");
            executeUpdate(statement);

            // Tabela Internação
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Internacao (
                    idInternacao INTEGER PRIMARY KEY AUTOINCREMENT,
                    idVeterinario INTEGER NOT NULL,
                    idAnimal INTEGER NOT NULL,
                    dataInicio VARCHAR NOT NULL,
                    dataFim VARCHAR NULL,
                    evolucao VARCHAR,
                    FOREIGN KEY(idVeterinario) REFERENCES Veterinario(idveterinario),
                    FOREIGN KEY(idAnimal) REFERENCES Animal(idanimal)
                    );""");
            executeUpdate(statement);

            // Tabela Vacinação
            statement = DAO.getConnection().prepareStatement("""
                    CREATE TABLE IF NOT EXISTS Vacinacao (
                    idVacinacao INTEGER PRIMARY KEY AUTOINCREMENT,
                    idVeterinario INTEGER NOT NULL,
                    idAnimal INTEGER NOT NULL,
                    nomeVacina VARCHAR NOT NULL,
                    data VARCHAR NOT NULL,
                    proximaDose VARCHAR NULL,
                    FOREIGN KEY(idVeterinario) REFERENCES Veterinario(idveterinario),
                    FOREIGN KEY(idAnimal) REFERENCES Animal(idanimal)
                    );""");
            executeUpdate(statement);

            return true;
        } catch (SQLException exception) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, exception);
            return false;
        }
    }

}
