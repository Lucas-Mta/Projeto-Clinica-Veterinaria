public abstract class FuncionarioUsuario extends Pessoa {
    private int idLogin;
    private String login;
    private String senha;
    private int nivelAcesso;

    public FuncionarioUsuario(String cpf, String nome, String endereco, String telefone, String email, int idLogin, String login, String senha, int nivelAcesso) {
        super(cpf, nome, endereco, telefone, email);
        this.idLogin = idLogin;
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    // Getters
    public int getIdLogin() {
        return idLogin;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    // Setters
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void fazerLogin() {
        // Implementar
    }
}
