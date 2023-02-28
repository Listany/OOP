package Seminar004Homework;

import Seminar004Homework.WeaponsShields.Melee;

//уточнение типа используемого оружия, вместо дженерика в классе бейзХиро

public class Footman extends BaseHero<Melee, Shield>{

    /*public Footman(int helth, String name, Melee weapon) {
        super(helth, name, weapon);
    }*/

    public Footman(int helth, String name, Melee weapon, Shield shield) {
        super(helth, name, weapon, shield);
    }

    @Override
    public String toString() {
        return "Footman{" +
                super.toString();
    }
}
