package Seminar004Homework.WeaponsShields;

import Seminar004Homework.Weapon;

public class Melee implements Weapon {

    String weaponName;

    private int damagePoint;

    public Melee(String weaponName, int damagePoint) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
    }

    @Override
    public int damage() {
        return damagePoint;
    }

    @Override
    public String toString() {
        return "Melee{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                '}';
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getDamagePoint() {
        return damagePoint;
    }
}
