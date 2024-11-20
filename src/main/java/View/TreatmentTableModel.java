package View;

import java.util.List;
import Model.Treatment;
import Model.TreatmentDAO;

// TableModel específico para a classe Treatment.

public class TreatmentTableModel extends GenericTableModel {

    public TreatmentTableModel(List<Treatment> vDados) {
        super(vDados, new String[]{"ID", "Nome do Animal", "Data Inicial", "Data Final", "Descrição", "Encerrado"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1 -> String.class; // Nome do Animal
            case 2, 3 -> String.class; // Datas (Inicial e Final)
            case 4 -> String.class; // Descrição
            case 5 -> Boolean.class; // Encerrado
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Treatment treatment = (Treatment) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> treatment.getTreatmentId();
            // TODO Fazer alguma coisa que coloque o nome do animal e não o ID
            // case 1 -> treatment.getAnimalName();
            case 2 -> treatment.getStartDate();
            case 3 -> treatment.getEndDate();
            case 4 -> treatment.getDescription();
            case 5 -> treatment.isFinished();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
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
                treatment.setDescription((String) aValue);
                break;
            case 5:
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
