package Seminar001_Homework;

// класс наследник
public class CurecedProducts extends Product{

    private int longivity;
    public CurecedProducts(String name, double cost, int longivity) {
        super(name, cost);
        this.longivity = longivity;
    }

    @Override
    public String toString() {
        return String.format("%s Срок годности - %d \n", super.toString(), longivity);
    }
}
