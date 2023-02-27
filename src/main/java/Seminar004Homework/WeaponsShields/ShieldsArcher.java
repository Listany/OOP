package Seminar004Homework.WeaponsShields;

import Seminar004Homework.Shield;

public class ShieldsArcher implements Shield {

    String materialShields;

    private int protectionPoint;

    public ShieldsArcher(String materialShields, int protectionPoint) {
        this.materialShields = materialShields;
        this.protectionPoint = protectionPoint;
    }

    @Override
    public int protection() {
        return protectionPoint;
    }

    @Override
    public String toString() {
        return "ShieldsArcher{" +
                "materialShields='" + materialShields + '\'' +
                ", protectionPoint=" + protectionPoint +
                '}';
    }

    public String getMaterialShields() {
        return materialShields;
    }

    public int getProtectionPoint() {
        return protectionPoint;
    }
}
