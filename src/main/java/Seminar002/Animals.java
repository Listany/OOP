package Seminar002;

public abstract class Animals implements Sayable{

    public String name;

    public Animals(String name) {
        this.name = name;
    }

    public abstract String feed(); // абстрактный метод - мы обязуемся, что потом его будем переопределять

    @Override
    public String toString() {
        return "My name " + name;
    }
}
