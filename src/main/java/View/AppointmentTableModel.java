package View;

import java.util.List;
import Model.Appointment;
import Model.AppointmentDAO;

// TableModel específico para a classe Appointment

public class AppointmentTableModel extends GenericTableModel {

    public AppointmentTableModel(List<Appointment> dataVector) {
        super(dataVector, new String[]{"ID", "Data", "Hora", "Animal", "Veterinário", "ID Tratamento", "Sintomas"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1, 2, 3, 4 -> String.class; // Data e Hora e Nome do Animal e do Veterinário
            case 5 -> Integer.class; // ID do Tratamento
            case 6 -> String.class; // Sintomas
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Appointment appointment = (Appointment) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> appointment.getAppointmentId();
            case 1 -> appointment.getDate();
            case 2 -> appointment.getHour();
            // TODO Fazer alguma coisa que coloque o nome do animal e do veterinário e não o ID
            // case 3 -> appointment.getAnimalName();
            // case 4 -> appointment.getVetName();
            case 5 -> appointment.getTreatmentId();
            case 6 -> appointment.getSymptoms();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
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
            case 6:
                appointment.setSymptoms((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        AppointmentDAO.getInstance().update(appointment);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitir edição apenas em Data, Hora e Sintomas
        return columnIndex == 1 || columnIndex == 2 || columnIndex == 6;
    }
}
