package View.TableModels;

import java.util.List;

import Controller.Controller;
import Model.Animal;
import Model.AnimalDAO;
import Model.Treatment;
import Model.TreatmentDAO;

import javax.swing.*;

// TableModel específico para a classe Treatment.

public class TreatmentTableModel extends GenericTableModel {

    public TreatmentTableModel(List<Treatment> dataVector) {
        super(dataVector, new String[]{"ID", "Nome do Animal", "Descrição", "Data Inicial", "Data Final", "Encerrado"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1, 2 -> String.class; // Nome do Animal e Descrição
            case 3, 4 -> String.class; // Datas (Inicial e Final)
            case 5 -> Boolean.class; // Encerrado
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
                return (animal != null) ? animal.getName() : "";
            case 2:
                return treatment.getDescription(); // Descrição
            case 3:
                return treatment.getStartDate(); // Data Inicial
            case 4:
                return treatment.getEndDate(); // Data Final
            case 5:
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
                treatment.setDescription((String) aValue); // Atualiza descrição
                break;

            case 3:
                treatment.setStartDate((String) aValue); // Atualiza data inicial
                break;

            case 4: // Atualiza data final
                String newEndDate = (String) aValue;
                treatment.setEndDate((String) aValue);

                // Foi mal pelo nome da variável, só tava com preguiça de ter que mudar o métod0
                JTextField onlyForVerification = new JTextField(newEndDate);

                // Se a data final foi preenchida e for válida, marca como encerrado automaticamente
                if (!newEndDate.isEmpty() && Controller.isValidDate(onlyForVerification)) {
                    treatment.setFinished(true);
                } else {
                    // Mostra um alerta e limpa a data
                    JOptionPane.showMessageDialog(null, "A data informada é inválida.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
                    treatment.setEndDate("");
                }
                break;

            case 5: // Atualiza status de encerrado
                boolean isFinished = (Boolean) aValue;
                treatment.setFinished(isFinished);

                // Se foi marcado como encerrado, define a data final como a data atual
                if (isFinished) {
                    treatment.setEndDate(Controller.getCurrentDate());
                } else {
                    // Se desmarcado, limpa a data final
                    treatment.setEndDate("");
                }
                break;

            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        // Atualiza no banco de dados
        TreatmentDAO.getInstance().update(treatment);

        // Notifica a tabela sobre a alteração
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitimos edição em todos os campos, exceto ID e Nome do Animal
        return columnIndex > 1;
    }
}
