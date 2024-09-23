package Model;

public class Veterinarian extends Employee {
    private int vetId;
    private String specialty;
    private String serviceHour;
    private int roomNum;

    public Veterinarian(String cpf, String name, String address, String phone, String email, String login, String password, int vetId, String specialty, String serviceHour, int roomNum) {
        super(cpf, name, address, phone, email, 1, login, password); // Nível de Acesso: 1 -> Veterinário(a)
        this.vetId = vetId;
        this.specialty = specialty;
        this.serviceHour = serviceHour;
        this.roomNum = roomNum;
    }

    // Getters
    public int getVetId() {
        return vetId;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getServiceHour() {
        return serviceHour;
    }

    public int getRoomNum() {
        return roomNum;
    }

    // Setters
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setServiceHour(String serviceHour) {
        this.serviceHour = serviceHour;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    @Override
    public String toString() {
        return "Veterinário(a) [Nome: " + getName()
                + ", CPF: " + getCpf()
                + ", Telefone: " + getPhone()
                + ", Email: " + getEmail()
                + ", ID: " + vetId
                + ", Especialidade: " + specialty
                + ", Hora de Atendimento: " + serviceHour
                + ", Número da Sala: " + roomNum
                + "]";
    }
}
