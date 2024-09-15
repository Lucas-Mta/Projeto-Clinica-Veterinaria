import java.util.Date;

public class Relatorio {
    private int qntAnimais;
    private int qntTratamentos;
    private int qntConsultas;
    private int qntMedicamentos;

    public Relatorio(int qntAnimais, int qntTratamentos, int qntConsultas, int qntMedicamentos) {
        this.qntAnimais = qntAnimais;
        this.qntTratamentos = qntTratamentos;
        this.qntConsultas = qntConsultas;
        this.qntMedicamentos = qntMedicamentos;
    }

    // Getters
    public int getQntAnimais() {
        return qntAnimais;
    }

    public int getQntTratamentos() {
        return qntTratamentos;
    }

    public int getQntConsultas() {
        return qntConsultas;
    }

    public int getQntMedicamentos() {
        return qntMedicamentos;
    }

    // Setters
    public void setQntAnimais(int qntAnimais) {
        this.qntAnimais = qntAnimais;
    }

    public void setQntTratamentos(int qntTratamentos) {
        this.qntTratamentos = qntTratamentos;
    }

    public void setQntConsultas(int qntConsultas) {
        this.qntConsultas = qntConsultas;
    }

    public void setQntMedicamentos(int qntMedicamentos) {
        this.qntMedicamentos = qntMedicamentos;
    }

    // Métodos de Relatorio
    public void consultasPorPeriodo(Date inicio, Date fim) {
        // Implementação de filtro de consultas por período
        System.out.println("Consultas realizadas entre " + inicio + " e " + fim);
        // Ver como fazer a busca de dados de consultas do sistema
    }

    public void tratamentosPorPeriodo(Date inicio, Date fim) {
        // Implementação de filtro de tratamentos por período
        System.out.println("Tratamentos realizados entre " + inicio + " e " + fim);
        // Ver como fazer a busca de dados de consultas do sistema
    }

    public void mostrarInfos() {
        System.out.println("Relatório de Informações:");
        System.out.println("Quantidade de Animais: " + qntAnimais);
        System.out.println("Quantidade de Tratamentos: " + qntTratamentos);
        System.out.println("Quantidade de Consultas: " + qntConsultas);
        System.out.println("Quantidade de Medicamentos: " + qntMedicamentos);
    }

}
