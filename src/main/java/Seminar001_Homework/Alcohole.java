package Seminar001double;

public class Alcohole extends Product{

    private double alcoContent;


    public Alcohole(String name, double cost) {
        super(name, cost);
    }

    public Alcohole(String name, double cost, double alcoContent) {
        this(name, cost);
        this.alcoContent = alcoContent;
    }

    @Override
    public String toString() {
        return String.format("%s Алкоголь - %2.2f", super.toString(), alcoContent);
    }
}
