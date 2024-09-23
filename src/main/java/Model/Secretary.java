package Model;

public class Secretary extends Employee {
    private int secretaryId;
    private String workShift;

    public Secretary(String cpf, String name, String address, String phone, String email, String login, String password, int secretaryId, String workShift) {
        super(cpf, name, address, phone, email, 0, login, password); // Nível de acesso 0 para secretário(a)
        this.secretaryId = secretaryId;
        this.workShift = workShift;
    }

    // Getters
    public int getSecretaryId() {
        return secretaryId;
    }

    public String getWorkShift() {
        return workShift;
    }

    // Setters
    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @Override
    public String toString() {
        return "Secretário(a) [Nome: " + getName()
                + ", CPF: " + getCpf()
                + ", Telefone: " + getPhone()
                + ", Email: " + getEmail()
                + ", ID: " + secretaryId
                + ", Turno: " + workShift
                + "]";
    }
}
