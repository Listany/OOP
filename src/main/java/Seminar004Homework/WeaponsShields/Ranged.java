package Seminar004Homework.WeaponsShields;

import Seminar004Homework.Weapon;

public class Ranged implements Weapon {

    private String weaponName;

    private int damagePoint;

    private int range;

    @Override
    public int damage() {
        return damagePoint;
    }

    public Ranged(String weaponName, int damagePoint, int range) {
        this.weaponName = weaponName;
        this.damagePoint = damagePoint;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Ranged{" +
                "weaponName='" + weaponName + '\'' +
                ", damagePoint=" + damagePoint +
                ", range=" + range +
                '}';
    }

    public String getWeaponName() {
        return weaponName;
    }

    public int getDamagePoint() {
        return damagePoint;
    }

    public int getRange() {
        return range;
    }


}
