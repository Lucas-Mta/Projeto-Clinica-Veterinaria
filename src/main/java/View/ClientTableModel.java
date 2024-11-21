package View;

// TableModel específico para a classe Client

import Model.Client;
import Model.ClientDAO;

import java.util.List;

public class ClientTableModel extends GenericTableModel {

    public ClientTableModel(List<Client> dataVector) {
        super(dataVector, new String[] {"CPF", "Nome", "Email", "Telefone", "Endereço"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0, 1, 2, 3, 4, 5 -> String.class; // Todas as colunas são Strings
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    // Pega a informação de uma determinada CÉLULA na tabela:
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = (Client) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> client.getCpf(); // CPF
            case 1 -> client.getName(); // Nome
            case 2 -> client.getEmail(); // Email
            case 3 -> client.getPhone(); // Telefone
            case 4 -> client.getAddress(); // Endereço
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    // "Seta" a nova informação em uma determinada CÉLULA na tabela:
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Client client = (Client) dataVector.get(rowIndex);

        // Não é possível mudar o CPF
        switch (columnIndex) {
            case 1:
                client.setName((String) aValue);
                break;
            case 2:
                client.setEmail((String) aValue);
                break;
            case 3:
                client.setPhone((String) aValue);
                break;
            case 4:
                client.setAddress((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        // Atualiza o cliente no banco de dados
        ClientDAO.getInstance().update(client);
    }

    // Verifica quais células são editáveis -> CPF NÃO É EDITÁVEL
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 0;
    }

}
