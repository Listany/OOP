package Seminar002;

public class Duck extends Herbivores implements Runable, Flyable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Кря-кря! ";
    }

    @Override
    public int speedOfFly() {
        return 350;
    }

    @Override
    public int speedOfRun() {
        return 2;
    }

    @Override
    public String toString() {
        return "I`m duck " + super.toString()  + " Я бегаю со скоростью " + speedOfRun() + " и летаю со скоростью " + speedOfFly();
    }
}
