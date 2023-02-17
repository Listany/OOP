package Seminar002;

public abstract class Herbivores extends Animals{

    public Herbivores(String name) {
        super(name);
    }

    public String feed(){
        return "grass";
    }
}
