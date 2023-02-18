package Seminar002;

public class Cat extends Predator implements Runable{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I`m cat " + super.toString() + " Я бегаю со скоростью " + speedOfRun();
    }

    @Override
    public String say() {
        return "Мяу-мяу";
    }

    @Override
    public int speedOfRun() {
        return 30;
    }
}
