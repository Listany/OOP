package Seminar004Homework.WeaponsShields;

import Seminar004Homework.Shield;

public class ShieldFootman extends ShieldsArcher implements Shield {

    int diametrShield;


    public ShieldFootman(String materialShields, int protectionPoint, int diametrShield) {
        super(materialShields, protectionPoint);
        this.diametrShield = diametrShield;
    }

    @Override
    public String toString() {
        return "ShieldFootman{" +
                "diametrShield=" + diametrShield +
                ", materialShields='" + materialShields + '\'' +
                '}';
    }

    public int getDiametrShield() {
        return diametrShield;
    }
}
