package Seminar004Homework;

import Seminar004Homework.WeaponsShields.Ranged;
import Seminar004Homework.WeaponsShields.ShieldsArcher;

//уточнение типа используемого оружия, вместо дженерика в классе бейзХиро
public class Archer extends BaseHero<Ranged, ShieldsArcher>{

    /*public Archer(int helth, String name, Ranged weaponRanged) {
        super(helth, name, weaponRanged);
    }*/

    public Archer(int helth, String name, Ranged weapon, ShieldsArcher shield) {
        super(helth, name, weapon, shield);
    }

    public int range(){
        //return  ((Ranged)weapon).getRange(); // приведение типа - тип випон привели к типу ренджед, получили доступ к гетРендж
        return  weapon.getRange(); // после уточнения типа оружия вместо дженерика приведение типа уже не нужно!

    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString();
    }
}
