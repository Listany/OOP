package Seminar001double;

public class Sigaretts extends Product{
    int amount;


    public Sigaretts(String name, double cost, int amount) {
        super(name, cost);
        this.amount = amount;


    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("%s Количество в пачке %d КУРЕНИЕ ПРИВОДИТ К РАКУ!!!", super.toString(), amount);
    }
}
