package Seminar002;

public class Cow extends Herbivores implements Runable{
    public Cow(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I`m cow " + super.toString()  + " Я бегаю со скоростью " + speedOfRun();
    }

    @Override
    public String say() {
        return "Мууууу";
    }

    @Override
    public int speedOfRun() {
        return 5;
    }
}
