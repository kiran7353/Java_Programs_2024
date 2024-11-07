import java.util.ArrayList;

public class Root {
    public ArrayList<details> accounting;
    public ArrayList<details> sales;

    public ArrayList<details> getAccounting() {
        return accounting;
    }

    public void setAccounting(ArrayList<details> accounting) {
        this.accounting = accounting;
    }

    public ArrayList<details> getSales() {
        return sales;
    }

    public void setSales(ArrayList<details> sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Root{" +
                "accounting=" + accounting +
                ", sales=" + sales +
                '}';
    }
}
