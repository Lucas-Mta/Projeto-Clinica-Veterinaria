package View;

// TableModel específico para a classe Client

import Model.Client;
import Model.ClientDAO;

import java.util.List;

public class ClientTableModel extends GenericTableModel {

    public ClientTableModel(List<Client> dataVector) {
        super(dataVector, new String[] {"ID", "CPF", "Nome", "Endereço", "Telefone", "Email"});
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 0 -> Integer.class; // Id
            case 1 -> String.class; // CPF
            case 2 -> String.class; // Nome
            case 3 -> String.class; // Endereço
            case 4 -> String.class; // Telefone
            case 5 -> String.class; // Email
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    // Pega a informação de uma determinada CÉLULA na tabela:
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = (Client) dataVector.get(rowIndex);

        return switch (columnIndex) {
            case 0 -> client.getClientId(); // ID do cliente
            case 1 -> client.getCpf(); // CPF
            case 2 -> client.getName(); // Nome
            case 3 -> client.getAddress(); // Endereço
            case 4 -> client.getPhone(); // Telefone
            case 5 -> client.getEmail(); // Email
            default -> throw new IndexOutOfBoundsException("ColumnIndex out of bounds.");
        };
    }

    // "Seta" a nova informação em uma determinada CÉLULA na tabela:
    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Client client = (Client) dataVector.get(rowIndex);

        // Não é possível mudar nem o Id, nem o CPF
        switch (columnIndex) {
            case 2:
                client.setName((String) aValue);
                break;
            case 3:
                client.setAddress((String) aValue);
                break;
            case 4:
                client.setPhone((String) aValue);
                break;
            case 5:
                client.setEmail((String) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }

        // Atualiza o cliente no banco de dados
        ClientDAO.getInstance().update(client);
    }

    // Verifica quais células são editáveis -> As células de ID e CPF NÃO SÃO EDITÁVEIS
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex > 1;
    }

}
