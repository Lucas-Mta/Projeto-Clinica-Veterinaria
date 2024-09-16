package Model;

public class Secretary extends EmployeeUser {
    private int secretaryId;
    private String workShift;

    public Secretary(String cpf, String name, String address, String phone, String email, int secretaryId, String workShift) {
        super(cpf, name, address, phone, email);
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
}
