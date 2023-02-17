package Seminar002;

public class Dog extends Predator implements Runable{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "I`m dog " + super.toString()  + " Я бегаю со скоростью " + speedOfRun();
    }

    @Override
    public String say() {
        return "Гав-гав";
    }


    @Override
    public int speedOfRun() {
        return 20;
    }
}
