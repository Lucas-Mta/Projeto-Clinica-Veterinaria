package Model;

public abstract class Person {
    private String cpf;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Person(String cpf, String name, String address, String phone, String email) {
        this.cpf = cpf;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getters:
    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    // Setters:
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) { this.email = email; }

}
