public class Medicamento {
    private int idMedicamento;
    private String nome;
    private int estoqueMinimo;

    public Medicamento(int idMedicamento, String nome, int estoqueMinimo) {
        this.idMedicamento = idMedicamento;
        this.nome = nome;
        this.estoqueMinimo = estoqueMinimo;
    }

    // Getters
    public int getIdMedicamento() {
        return idMedicamento;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    // Métodos de Medicamento
    public void controlarEstoque() {
        // Implementação...
    }

    public boolean registrarSaida() {
        // Implementação...
        return true;
    }
}
