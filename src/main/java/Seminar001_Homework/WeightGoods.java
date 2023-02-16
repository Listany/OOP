package Seminar001double;

public class WeightGoods extends Product{

    private double weight;

    public WeightGoods(String name, double cost, double weight) {
        super(name, cost);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s Вес товара - %2.2f", super.toString(), weight);
    }
}
