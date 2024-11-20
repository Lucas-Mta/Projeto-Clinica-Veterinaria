package View;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.JViewport;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;

// Classe abstrata que serve como base para criação de tabelas genéricas.

public abstract class GenericTableModel extends AbstractTableModel {
    // Lista de objetos que armazenam os dados da tabela
    protected ArrayList<Object> dataVector;
    // Array de strings que contém os nomes das columns
    protected String[] columns;

    // Construtor que inicializa os dados e os nomes das columns
    public GenericTableModel(List dataVector, String[] columns) {
        this.columns = columns;
        this.dataVector = (ArrayList) dataVector; // Converte para ArrayList
    }

    // Retorna o número de columns da tabela
    @Override
    public int getColumnCount() {
        return columns.length;
    }

    // Retorna o número de linhas da tabela
    @Override
    public int getRowCount() {
        return dataVector.size();
    }

    // Retorna o nome da coluna dado o índice
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    // -------------------- Métodos auxiliares --------------------

    // Retorna um objeto de uma linha específica
    public Object getItem(int rowIndex) {
        if (rowIndex < 0) { // Verifica se o índice é inválido
            return null;
        }
        return dataVector.get(rowIndex); // Retorna o item na linha correspondente
    }

    // Adiciona um novo item à tabela e notifica os observadores
    public void addItem(Object object) {
        dataVector.add(object); // Adiciona o objeto à lista
        int lastIndex = getRowCount() - 1; // Obtém o índice do novo item
        fireTableRowsInserted(lastIndex, lastIndex); // Atualiza a tabela
    }

    // Remove um item da tabela por índice e notifica os observadores
    public void removeItem(int rowIndex) {
        dataVector.remove(rowIndex); // Remove o item da lista
        fireTableRowsDeleted(rowIndex, rowIndex); // Atualiza a tabela
    }

    // Adiciona uma lista de itens à tabela (substitui os existentes)
    public void addListOfItems(List<Object> itensVector) {
        this.clear(); // Limpa os dados existentes
        for (Object obj : itensVector) { // Adiciona cada item da nova lista
            this.addItem(obj);
        }
    }

    // Limpa todos os dados da tabela e notifica os observadores
    public void clear() {
        dataVector.clear(); // Limpa a lista de dados
        fireTableDataChanged(); // Notifica a tabela de que os dados mudaram
    }

    // Verifica se a tabela está vazia
    public boolean isEmpty() {
        return dataVector.isEmpty();
    }

    // Define a largura de cada coluna em uma JTable
    public void setColumnWidth(JTable myTable, int[] vWidth) {
        myTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Desativa ajuste automático de largura
        for (int i = 0; i < vWidth.length; i++) { // Itera pelas columns
            TableColumn col = myTable.getColumnModel().getColumn(i); // Obtém a coluna
            col.setPreferredWidth(vWidth[i]); // Define a largura preferida
        }
    }

    // -------------------- Métodos de seleção e rolagem --------------------

    // Seleciona uma linha na tabela e rola para exibi-la
    public void selectAndScroll(JTable table, int rowIndex) {
        table.getSelectionModel().setSelectionInterval(rowIndex, rowIndex); // Seleciona a linha
        scrollToVisible(table, rowIndex); // Rola até a linha
    }

    // Rola para exibir uma linha específica
    public void scrollToVisible(JTable table, int rowIndex) {
        scrollToVisible(table, rowIndex, 0); // Chama o método com a coluna 0 por padrão
    }

    // Rola para exibir uma célula específica (linha e coluna)
    public void scrollToVisible(JTable table, int rowIndex, int vColIndex) {
        if (!(table.getParent() instanceof JViewport)) { // Verifica se o componente pai é um JViewport
            return; // Se não for, não faz nada
        }
        this.setViewPortPosition((JViewport) table.getParent(),
                table.getCellRect(rowIndex, vColIndex, true)); // Obtém a posição da célula
    }

    // Ajusta a posição do viewport para exibir uma célula
    private void setViewPortPosition(JViewport viewport, Rectangle position) {
        Point pt = viewport.getViewPosition(); // Obtém a posição atual do viewport
        position.setLocation(position.x - pt.x, position.y - pt.y); // Calcula a nova posição
        viewport.scrollRectToVisible(position); // Faz a rolagem
    }
}
