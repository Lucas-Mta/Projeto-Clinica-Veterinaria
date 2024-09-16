package Model;

public abstract class EmployeeUser extends Person {
    private int idEmpolyee;
    private String login;
    private String password;
    private int acessLevel;

    public EmployeeUser(String cpf, String name, String address, String phone, String email) {
        super(cpf, name, address, phone, email);
    }

    // Getters
    public int getIdEmpolyee() {
        return idEmpolyee;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAcessLevel() {
        return acessLevel;
    }

    // Setters
    public void setPassword(String password) {
        this.password = password;
    }

}
