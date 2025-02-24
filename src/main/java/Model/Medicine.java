package Model;

public class Medicine {
    private int drugId;
    private String name;
    private int minStock;

    public Medicine(int drugId, String name, int minStock) {
        this.drugId = drugId;
        this.name = name;
        this.minStock = minStock;
    }

    // Getters
    public int getDrugId() {
        return drugId;
    }

    public String getName() {
        return name;
    }

    public int getMinStock() {
        return minStock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    @Override
    public String toString() {
        return "Medicamento [ID: " + drugId
                + ", Nome: " + name
                + ", Estoque Mínimo: " + minStock
                + "]";
    }
}
