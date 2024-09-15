import java.util.List;

public class Cliente extends Pessoa {
    private int idCliente;
    private List<Animal> animais;

    public Cliente(String cpf, String nome, String endereco, String telefone, String email, int idCliente, List<Animal> animais) {
        super(cpf, nome, endereco, telefone, email);
        this.idCliente = idCliente;
        this.animais = animais;
    }

    // Getters
    public int getIdCliente() {
        return idCliente;
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    // Métodos de Cliente
    public int cadastrarCliente() {
        // Implementação...
        return idCliente;
    }

    public Cliente consultarCliente() {
        // Implementação...
        return this;
    }

    public void atualizarCliente() {
        //  Implementação...
    }

    public boolean excluirCliente() {
        // Implementação...
        return true;
    }

}
