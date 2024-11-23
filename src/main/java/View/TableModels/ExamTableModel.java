package View.TableModels;

import java.util.List;
import Model.Exam;
import Model.ExamDAO;

// TableModel específico para a classe Exam.

public class ExamTableModel extends GenericTableModel {

    public ExamTableModel(List<Exam> dataVector) {
        super(dataVector, new String[]{"Tipo", "Data da Solicitação", "Status"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0, 1, 2 -> String.class; // Strings
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exam exam = (Exam) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> exam.getExamType();
            case 1 -> exam.getRequestDate();
            case 2 -> exam.getStatus();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Exam exam = (Exam) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 0:
                exam.setExamType((String) aValue);
                break;
            case 2:
                exam.setStatus((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        ExamDAO.getInstance().update(exam);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Só não pode editar a data de solicitação
        return columnIndex != 1;
    }
}
