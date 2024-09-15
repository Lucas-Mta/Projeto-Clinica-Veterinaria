import java.sql.Time;

public class Veterinario extends FuncionarioUsuario {
    private int idVeterinario;
    private String especialidade;
    private Time horaAtendimento;
    private int numSala;

    public Veterinario(String cpf, String nome, String endereco, String telefone, String email, int idLogin, String login, String senha, int nivelAcesso, int idVeterinario, String especialidade, Time horaAtendimento, int numSala) {
        super(cpf, nome, endereco, telefone, email, idLogin, login, senha, nivelAcesso);
        this.idVeterinario = idVeterinario;
        this.especialidade = especialidade;
        this.horaAtendimento = horaAtendimento;
        this.numSala = numSala;
    }

    // Getters
    public int getIdVeterinario() {
        return idVeterinario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Time getHoraAtendimento() {
        return horaAtendimento;
    }

    public int getNumSala() {
        return numSala;
    }

    // Setters
    public void setHoraAtendimento(Time horaAtendimento) {
        this.horaAtendimento = horaAtendimento;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    // Métodos do Veterinário
    public int cadastrarVeterinario() {
        // Implementação...
        return idVeterinario;
    }

    public Veterinario consultarVeterinario() {
        // Implementação...
        return this;
    }

    public void atualizarVeterinario() {
        // Implementação...
    }

    public boolean excluirVeterinario() {
        // Implementação...
        return true;
    }
}
