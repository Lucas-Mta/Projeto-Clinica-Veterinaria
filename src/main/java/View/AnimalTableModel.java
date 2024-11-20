package View;

// TableModel específico para a classe Animal

import Model.Animal;
import Model.AnimalDAO;

import java.util.List;

public class AnimalTableModel extends GenericTableModel {

    public AnimalTableModel(List<Animal> dataVector) {
        super(dataVector, new String[]{"ID", "Nome", "Idade", "Sexo", "Peso", "Proprietário", "Espécie"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // ID
            case 1 -> String.class; // Nome
            case 2 -> Integer.class; // Idade
            case 3 -> Character.class; // Sexo
            case 4 -> Double.class; // Peso
            case 5 -> Integer.class; // ID do Proprietário
            case 6 -> Integer.class; // ID da Espécie
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = (Animal) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> animal.getAnimalId();
            case 1 -> animal.getName();
            case 2 -> animal.getAge();
            case 3 -> animal.getGender();
            case 4 -> animal.getWeight();
            case 5 -> animal.getOwnerId();
            case 6 -> animal.getSpecieId();
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Animal animal = (Animal) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 1:
                animal.setName((String) aValue);
                break;
            case 2:
                animal.setAge((Integer) aValue);
                break;
            case 3:
                animal.setGender((Character) aValue);
                break;
            case 4:
                animal.setWeight((Double) aValue);
                break;
            case 5:
                animal.setOwnerId((Integer) aValue);
                break;
            case 6:
                animal.setSpecieId((Integer) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        }

        // Atualiza o animal no banco de dados
        AnimalDAO.getInstance().update(animal);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitimos edição em todos os campos, exceto o ID
        return columnIndex > 0;
    }
}