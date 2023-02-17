package Seminar002;

public class Butterfly extends Herbivores implements Flyable, Sayable{


    public Butterfly(String name) {
        super(name);
    }

    @Override
    public int speedOfFly() {
        return 6;
    }


    @Override
    public String say() {
        return "Бяк-бяк-бяк!";
    }

    @Override
    public String toString() {
        return "I`m butterfly " + super.toString()  + " я летаю со скоростью " + speedOfFly();
    }
}
