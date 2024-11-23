package View.TableModels;

// TableModel específico para a classe Animal

import Model.*;

import java.util.List;

public class AnimalTableModel extends GenericTableModel {

    public AnimalTableModel(List<Animal> dataVector) {
        super(dataVector, new String[]{"Nome", "Idade", "Sexo", "Peso", "Espécie"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> String.class; // Nome
            case 1 -> Integer.class; // Idade
            case 2 -> Character.class; // Sexo
            case 3 -> Double.class; // Peso
            case 4 -> String.class; // Nome da Espécie
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Animal animal = (Animal) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return animal.getName(); // Nome
            case 1:
                return animal.getAge(); // Idade
            case 2:
                return animal.getGender(); // Sexo(Gênero)
            case 3:
                return animal.getWeight(); // Peso
            case 4:
                // Nome da Espécie
                Specie specie = SpecieDAO.getInstance().retrieveById(animal.getSpecieId());
                if (specie != null) {
                    return specie.getSpecieName();
                }
                return "";
            default:
                throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Animal animal = (Animal) dataVector.get(rowIndex);

        switch (columnIndex) {
            case 0: // Nome do animal
                animal.setName((String) aValue);
                break;
            case 1: // Idade do Animal
                animal.setAge((Integer) aValue);
                break;
            case 2: // Sexo(Gênero) do Animal
                animal.setGender((Character) aValue);
                break;
            case 3: // Peso
                animal.setWeight((Double) aValue);
                break;
            case 4: // Nome da Espécie
                Specie specie = (Specie) SpecieDAO.getInstance().retrieveByName((String) aValue);
                if (specie == null) {
                    specie = SpecieDAO.getInstance().create((String) aValue); // Cria uma nova espécie com esse nome
                }
                animal.setSpecieId(specie.getSpecieId());
                break;
            default:
                throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        }

        // Atualiza o animal no banco de dados
        AnimalDAO.getInstance().update(animal);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        // Permitir edição em todos os campos
        return true;
    }
}