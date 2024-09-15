import java.util.Date;

public class Vacinacao {
    private int idVacinacao;
    private Veterinario responsavel;
    private Animal animal;
    private String vacina;
    private Date dataVacinacao;
    private Date proximaDose;

    public Vacinacao(int idVacinacao, Veterinario responsavel, Animal animal, String vacina, Date dataVacinacao) {
        this.idVacinacao = idVacinacao;
        this.responsavel = responsavel;
        this.animal = animal;
        this.vacina = vacina;
        this.dataVacinacao = dataVacinacao;
    }

    // Getters
    public int getIdVacinacao() {
        return idVacinacao;
    }

    public Veterinario getResponsavel() {
        return responsavel;
    }

    public Animal getAnimal() {
        return animal;
    }

    public String getVacina() {
        return vacina;
    }

    public Date getDataVacinacao() {
        return dataVacinacao;
    }

    public Date getProximaDose() {
        return proximaDose;
    }

    // Setters
    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public void setDataVacinacao(Date dataVacinacao) {
        this.dataVacinacao = dataVacinacao;
    }

    public void setProximaDose(Date proximaDose) {
        this.proximaDose = proximaDose;
    }

    // Métodos de Vacinacao
    public void registrarVacinacao() {
        // Implementação
    }
}
