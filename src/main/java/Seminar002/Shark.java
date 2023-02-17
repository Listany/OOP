package Seminar002;

public class Shark extends Predator implements Swimable, Sayable{
    public Shark(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Буль-Буль";
    }

    @Override
    public int speedOfSwim() {
        return 1500;
    }

    @Override
    public String toString() {
        return "I`m shark " + super.toString()  + " Я плаваю со скоростью " + speedOfSwim();
    }
}
