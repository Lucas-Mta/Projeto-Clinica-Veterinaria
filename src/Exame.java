import java.util.Date;

public class Exame {
    private Consulta consulta;
    private String tipoExame;
    private String descricaoExame;
    private Date dataSolicitacao;
    private String status;
    private String resultados;

    public Exame(Consulta consulta, String tipoExame, Date dataSolicitacao, String descricaoExame, String status) {
        this.consulta = consulta;
        this.tipoExame = tipoExame;
        this.dataSolicitacao = dataSolicitacao;
        this.descricaoExame = descricaoExame;
        this.status = status;
    }

    // Getters
    public Consulta getConsulta() {
        return consulta;
    }

    public String getTipoExame() {
        return tipoExame;
    }

    public String getDescricaoExame() {
        return descricaoExame;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public String getStatus() {
        return status;
    }

    public String getResultados() {
        return resultados;
    }

    // Setters
    public void setDescricaoExame(String descricaoExame) {
        this.descricaoExame = descricaoExame;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }

    // Métodos de Exame
    public String solicitarExame() {
        // Implementação...
        return status;
    }

    public Exame consultarExame() {
        // Implementação...
        return this;
    }

    public boolean cancelarExame() {
        // Implementação...
        return true;
    }

}
