package View;

import java.util.List;
import Model.Veterinarian;
import Model.VeterinarianDAO;

//TableModel específico para a classe Veterinarian.

public class VeterinarianTableModel extends GenericTableModel {

    public VeterinarianTableModel(List<Veterinarian> dataVector) {
        super(dataVector, new String[]{"ID", "CPF", "Nome", "Especialidade", "Sala"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1 -> String.class; // CPF
            case 2 -> String.class; // Nome
            case 3 -> String.class; // Especialidade
            case 4  -> Integer.class; // Número da Sala
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Veterinarian vet = (Veterinarian) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> vet.getVetId();
            case 1 -> vet.getCpf();
            case 2 -> vet.getName();
            case 3 -> vet.getSpecialty();
            case 4 -> vet.getRoomNum();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Veterinarian vet = (Veterinarian) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 2:
                vet.setName((String) aValue);
                break;
            case 3:
                vet.setSpecialty((String) aValue);
                break;
            case 4:
                vet.setServiceHour((String) aValue);
                break;
            case 5:
                vet.setRoomNum((Integer) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        VeterinarianDAO.getInstance().update(vet);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitimos edição em todos os campos, exceto o ID e CPF
        return columnIndex > 1;
    }
}
