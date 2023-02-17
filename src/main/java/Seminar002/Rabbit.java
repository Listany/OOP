package Seminar002;

public class Rabbit extends Herbivores implements Runable{
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I`m rabbit " + super.toString()  + " Я бегаю со скоростью " + speedOfRun();
    }

    @Override
    public String say() {
        return "O my God!!!";
    }

    @Override
    public int speedOfRun() {
        return 3;
    }
}
