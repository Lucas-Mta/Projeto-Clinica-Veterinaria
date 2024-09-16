package Model;

import java.sql.Time;

public class Veterinarian extends EmployeeUser {
    private int vetId;
    private String specialty;
    private Time serviceHour;
    private int roomNum;

    public Veterinarian(String cpf, String name, String address, String phone, String email, int vetId, String specialty, Time serviceHour, int roomNum) {
        super(cpf, name, address, phone, email);
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

    public Time getServiceHour() {
        return serviceHour;
    }

    public int getRoomNum() {
        return roomNum;
    }

    // Setters
    public void setServiceHour(Time serviceHour) {
        this.serviceHour = serviceHour;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

}
