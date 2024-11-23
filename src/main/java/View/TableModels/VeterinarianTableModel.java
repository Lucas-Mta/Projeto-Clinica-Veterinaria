package View.TableModels;

import java.util.List;
import Model.Veterinarian;
import Model.VeterinarianDAO;

//TableModel específico para a classe Veterinarian.

public class VeterinarianTableModel extends GenericTableModel {

    public VeterinarianTableModel(List<Veterinarian> dataVector) {
        super(dataVector, new String[]{"Nome", "CPF", "Especialidade", "Sala"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class; // Nome
            case 1 -> String.class; // CPF
            case 2 -> String.class; // Especialidade
            case 3  -> Integer.class; // Número da Sala
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Veterinarian vet = (Veterinarian) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> vet.getName();
            case 1 -> vet.getCpf();
            case 2 -> vet.getSpecialty();
            case 3 -> vet.getRoomNum();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Veterinarian vet = (Veterinarian) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 0:
                vet.setName((String) aValue);
                break;
            case 2:
                vet.setSpecialty((String) aValue);
                break;
            case 3:
                vet.setRoomNum((Integer) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        VeterinarianDAO.getInstance().update(vet);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitimos edição em todos os campos, exceto CPF
        return columnIndex != 1;
    }
}
