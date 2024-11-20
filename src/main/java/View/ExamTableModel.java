package View;

import java.util.List;
import Model.Exam;
import Model.ExamDAO;

// TableModel específico para a classe Exam.

public class ExamTableModel extends GenericTableModel {

    public ExamTableModel(List<Exam> dataVector) {
        super(dataVector, new String[]{"ID", "ID Consulta", "Tipo", "Data Solicitação", "Status"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0, 1 -> Integer.class; // IDs
            case 2, 3, 4 -> String.class; // Strings
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Exam exam = (Exam) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> exam.getExamId();
            case 1 -> exam.getAppointmentId();
            case 2 -> exam.getExamType();
            case 3 -> exam.getRequestDate();
            case 4 -> exam.getStatus();
            default -> throw new IndexOutOfBoundsException("columnIndex out of bounds");
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Exam exam = (Exam) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 2:
                exam.setExamType((String) aValue);
                break;
            case 3:
                exam.setDescription((String) aValue);
                break;
            case 4:
                exam.setRequestDate((String) aValue);
                break;
            case 5:
                exam.setStatus((String) aValue);
                break;
            case 6:
                exam.setResults((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        ExamDAO.getInstance().update(exam);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitimos edição em todos os campos, exceto IDs
        return columnIndex > 1;
    }
}
