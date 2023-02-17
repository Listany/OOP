package Seminar002;

public abstract class Predator extends Animals{

    public Predator(String name) {
        super(name);
    }

    public String feed(){
        return "meat";
    }
}
