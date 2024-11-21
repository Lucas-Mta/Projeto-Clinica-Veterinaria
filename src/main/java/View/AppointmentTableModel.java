package View;

import java.util.List;

import Model.*;

// TableModel específico para a classe Appointment

public class AppointmentTableModel extends GenericTableModel {

    public AppointmentTableModel(List<Appointment> dataVector) {
        super(dataVector, new String[]{"ID da Consulta", "Data", "Hora", "Animal", "Veterinário"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1, 2, 3, 4 -> String.class; // Data, Hora, Nome do Animal e Nome do Veterinário
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Appointment appointment = (Appointment) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return appointment.getAppointmentId(); // ID
            case 1:
                return appointment.getDate(); // Data
            case 2:
                return appointment.getHour(); // Hora
            case 3:
                // Nome do Animal
                Animal animal = AnimalDAO.getInstance().retrieveById(appointment.getAnimalId());
                if (animal != null) {
                    return animal.getName();
                }
                return "";
            case 4:
                // Nome do Veterinário
                Veterinarian veterinarian = VeterinarianDAO.getInstance().retrieveById(appointment.getVetId());
                if (veterinarian != null) {
                    return veterinarian.getName();
                }
                return "";

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Appointment appointment = (Appointment) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 1:
                appointment.setDate((String) aValue);
                break;
            case 2:
                appointment.setHour((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        AppointmentDAO.getInstance().update(appointment);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitir edição apenas em Data, Hora e Sintomas
        return columnIndex == 1 || columnIndex == 2;
    }
}
