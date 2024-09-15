import java.util.Date;

public class Internacao {
    private int idInternacao;
    private Veterinario veterinario;
    private Animal animal;
    private Date dataInicio;
    private Date dataFim;
    private String evolucao;

    public Internacao(int idInternacao, Veterinario veterinario, Animal animal, Date dataInicio) {
        this.idInternacao = idInternacao;
        this.veterinario = veterinario;
        this.animal = animal;
        this.dataInicio = dataInicio;
    }

    // Getters
    public int getIdInternacao() {
        return idInternacao;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public String getEvolucao() {
        return evolucao;
    }

    // Setters
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    // Métodos de Internacao
    public int registrarInternacao() {
        // Implementação...
        return idInternacao;
    }

    public Internacao consultarInternacao() {
        // Implementação
        return this;
    }

    public boolean finalizarInternacao() {
        // Implementação
        return true;
    }

}
