import java.sql.Time;
import java.util.Date;
import java.util.List;

public class Consulta {
    private int idConsulta;
    private Date data;
    private Time hora;
    private Animal animal;
    private Veterinario vetResponsavel;
    private String sintomas;

    public Consulta(int idConsulta, Date data, Time hora, Animal animal, Veterinario vetResponsavel) {
        this.idConsulta = idConsulta;
        this.data = data;
        this.hora = hora;
        this.animal = animal;
        this.vetResponsavel = vetResponsavel;
    }

    // Getters
    public int getIdConsulta() {
        return idConsulta;
    }

    public Date getData() {
        return data;
    }

    public Time getHora() {
        return hora;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVetResponsavel() {
        return vetResponsavel;
    }

    public String getSintomas() {
        return sintomas;
    }

    // Setters
    public void setData(Date data) {
        this.data = data;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    // Métodos de Consulta
    public int agendarConsulta() {
        // Implementação...
        return idConsulta;
    }

    public Consulta verificarConsulta() {
        // Implementação...
        return this;
    }

    public boolean desmarcarConsulta() {
        // Implementação...
        return true;
    }

}
