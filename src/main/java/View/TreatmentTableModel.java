package View;

import java.util.List;

import Model.Animal;
import Model.AnimalDAO;
import Model.Treatment;
import Model.TreatmentDAO;

// TableModel específico para a classe Treatment.

public class TreatmentTableModel extends GenericTableModel {

    public TreatmentTableModel(List<Treatment> vDados) {
        super(vDados, new String[]{"ID", "Nome do Animal", "Data Inicial", "Data Final", "Encerrado"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1 -> String.class; // Nome do Animal
            case 2, 3 -> String.class; // Datas (Inicial e Final)
            case 4 -> Boolean.class; // Encerrado
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Treatment treatment = (Treatment) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return treatment.getTreatmentId(); // ID
            case 1:
                // Nome do Animal
                Animal animal = AnimalDAO.getInstance().retrieveById(treatment.getAnimalId());
                if (animal != null) {
                    return animal.getName();
                }
                return "";
            case 2:
                return treatment.getStartDate(); // Data Início
            case 3:
                return treatment.getEndDate(); // Data Fim
            case 4:
                return treatment.isFinished(); // Encerrado
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Treatment treatment = (Treatment) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 2:
                treatment.setStartDate((String) aValue);
                break;
            case 3:
                treatment.setEndDate((String) aValue);
                break;
            case 4:
                treatment.setFinished((Boolean) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        TreatmentDAO.getInstance().update(treatment);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitimos edição em todos os campos, exceto ID e Nome do Animal
        return columnIndex > 1;
    }
}
