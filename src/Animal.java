public class Animal {
    private int idAnimal;
    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private Cliente proprietario;
    private Especie especie;

    public Animal(int idAnimal, String nome, int idade, char sexo, double peso, Cliente proprietario, Especie especie) {
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.proprietario = proprietario;
        this.especie = especie;
    }

    // Getters
    public int getIdAnimal() {
        return idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public Especie getEspecie() {
        return especie;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    // Setters
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos de Animal
    public int cadastrarAnimal() {
        // Implementação...
        return idAnimal;
    }

    public Animal consultarAnimal() {
        // Implementação...
        return this;
    }

    public void atualizarAnimal() {
        // Implementação...
    }

    public boolean excluirAnimal() {
        // Implementação...
        return true;
    }

}
