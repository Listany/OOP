package Seminar004Homework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Т - тип, команда может состоять из классов, которые наследуются от БейзХиро. Т - дженерик


public class Team <T extends BaseHero> implements Iterable<T>{

    List<T> dreamTeam = new ArrayList<>();


    public void addInTeam(T t){
        dreamTeam.add(t);
    }

    //переопределение метода итератор
    @Override
    public Iterator<T> iterator() {
        return dreamTeam.iterator();
    }

    public int getTeamHelth(){
        int sumHelth = 0;
        for (T item : dreamTeam
             ) {
            sumHelth += item.getHelth();
        }
        return sumHelth;
    }

    public int getTeamRange(){
        int maxRange = 0;
        for (T item : dreamTeam
             ) {
            if (item instanceof Archer){ // проверяем можно ли привести игрока команды к типу арчер,
                Archer archer = (Archer) item; // если можно = то кастуем к типу
                if(maxRange < archer.range()){
                    maxRange = archer.range();
                }
            }
        }
        return maxRange;
    }

    public int getTeamDamage(){
        int sumDamage = 0;
        for (T item : dreamTeam
             ) {
            sumDamage += item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getMinProtection(){
        int minProtection = 0;
        String name = "";
        for (T item : dreamTeam
             ) {
            if(minProtection < item.getShield().protection()){
                minProtection = item.getShield().protection();
                name = item.getName();
            }
        }
        return (minProtection);
    }
}
