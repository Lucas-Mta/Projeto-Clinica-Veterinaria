public class Secretaria extends FuncionarioUsuario {
    private int idSecretaria;
    private String turno;

    public Secretaria(String cpf, String nome, String endereco, String telefone, String email, int idLogin, String login, String senha, int nivelAcesso, int idSecretaria, String turno) {
        super(cpf, nome, endereco, telefone, email, idLogin, login, senha, nivelAcesso);
        this.idSecretaria = idSecretaria;
        this.turno = turno;
    }

    // Getters
    public int getIdSecretaria() {
        return idSecretaria;
    }

    public String getTurno() {
        return turno;
    }

    // Setters
    public void setTurno(String turno) {
        this.turno = turno;
    }

    // Métodos da Secretária
    public int cadastrarSecretaria() {
        // Implementação...
        return idSecretaria;
    }

    public Secretaria consultarSecretaria() {
        // Implementação...
        return this;
    }

    public void atualizarSecretaria() {
        //  Implementação...
    }

    public boolean excluirSecretaria() {
        // Implementação...
        return true;
    }
}
