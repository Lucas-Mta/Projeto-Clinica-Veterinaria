public class Prescricao {
    private Veterinario vetResponsavel;
    private Consulta consulta;
    private Medicamento medicamento;
    private String problemaSaude;
    private int dosagem;
    private String instrucoes;

    public Prescricao(Veterinario vetResponsavel, Consulta consulta, Medicamento medicamento, String problemaSaude, int dosagem, String instrucoes) {
        this.vetResponsavel = vetResponsavel;
        this.consulta = consulta;
        this.medicamento = medicamento;
        this.problemaSaude = problemaSaude;
        this.dosagem = dosagem;
        this.instrucoes = instrucoes;
    }

    // Getters
    public Veterinario getVetResponsavel() {
        return vetResponsavel;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public String getProblemaSaude() {
        return problemaSaude;
    }

    public int getDosagem() {
        return dosagem;
    }

    public String getInstrucoes() {
        return instrucoes;
    }

    // Setters
    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }

    public void setDosagem(int dosagem) {
        this.dosagem = dosagem;
    }

    public void setInstrucoes(String instrucoes) {
        this.instrucoes = instrucoes;
    }

    public void emitirPrescicao() {
        // Implementação...
    }
}
