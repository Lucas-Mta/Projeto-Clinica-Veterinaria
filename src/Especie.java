public class Especie {
    private int idEspecie;
    private String nomeEspecie;

    public Especie(int idEspecie, String nomeEspecie) {
        this.idEspecie = idEspecie;
        this.nomeEspecie = nomeEspecie;
    }

    // Getters
    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public int getIdEspecie() {
        return idEspecie;
    }

    // Setters
    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    // Métodos de Especie
    public int cadastrarEspecie() {
        // Implementação...
        return idEspecie;
    }

    public Especie consultarEspecie() {
        // Implementação...
        return this;
    }

    public void atualizarEspecie() {
        // Implementação...
    }

    public boolean excluirEspecie() {
        // Implementação...
        return true;
    }


}
