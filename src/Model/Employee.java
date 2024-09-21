package Model;

public abstract class Employee extends Person {
    private int acessLevel;
    private String login;
    private String password;

    public Employee(String cpf, String name, String address, String phone, String email, int acessLevel, String login, String password) {
        super(cpf, name, address, phone, email);
        this.acessLevel = acessLevel;
        this.login = login;
        this.password = password;
    }

    // Getters
    public int getAcessLevel() {
        return acessLevel;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    // Setters
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
