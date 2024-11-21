package View;

import java.util.List;
import Model.Exam;
import Model.ExamDAO;

// TableModel específico para a classe Exam.

public class ExamTableModel extends GenericTableModel {

    public ExamTableModel(List<Exam> dataVector) {
        super(dataVector, new String[]{"ID da Consulta", "Tipo", "Data da Solicitação", "Status"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1, 2, 3 -> String.class; // Strings
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exam exam = (Exam) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> exam.getExamId();
            case 1 -> exam.getExamType();
            case 2 -> exam.getRequestDate();
            case 3 -> exam.getStatus();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Exam exam = (Exam) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 1:
                exam.setExamType((String) aValue);
                break;
            case 3:
                exam.setStatus((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        ExamDAO.getInstance().update(exam);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitindo edição apenas no Tipo e Status
        return columnIndex == 1 || columnIndex == 3;
    }
}
