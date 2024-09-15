import java.util.Date;
import java.util.List;

public class Tratamento {
    private int idTratamento;
    private Animal animal;
    private Date dataInicio;
    private Date dataFim;
    private String descricao;
    private List<Exame> exames;
    private boolean situacaoAndamento;

    public Tratamento(int idTratamento, Animal animal, Date dataInicio, Date dataFim, String descricao, List<Exame> exames, boolean situacaoAndamento) {
        this.idTratamento = idTratamento;
        this.animal = animal;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.exames = exames;
        this.situacaoAndamento = situacaoAndamento;
    }

    // Getters
    public int getIdTratamento() {
        return idTratamento;
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

    public String getDescricao() {
        return descricao;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public boolean isSituacaoAndamento() {
        return situacaoAndamento;
    }

    // Setters
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public void setSituacaoAndamento(boolean situacaoAndamento) {
        this.situacaoAndamento = situacaoAndamento;
    }

    // Métodos de Tratamento
    public int registrarTratamento() {
        // Implementação...
        return idTratamento;
    }

//    public List<Tratamento> listarTratamento() {
//        // Implementação...
//    }

    public Tratamento consultarTratamento() {
        // Implementação...
        return this;
    }

//    public int registrarExame(Exame exame) {
//        // Implementação
//        return exame.getIdExame();
//    }

    public boolean excluirTratamento() {
        // Implementação...
        return true;
    }

}
