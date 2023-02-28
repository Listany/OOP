package Seminar004Homework;

import Seminar004Homework.WeaponsShields.Melee;
import Seminar004Homework.WeaponsShields.Ranged;
import Seminar004Homework.WeaponsShields.ShieldFootman;
import Seminar004Homework.WeaponsShields.ShieldsArcher;

public class Main {
    public static void main(String[] args) {

        Team<Footman> footmanTeam = new Team<>();

        footmanTeam.addInTeam(new Footman(30, "Ivan",
                new Melee("Knife", 10),
                new ShieldFootman("Cotton", 5, 25)));
        footmanTeam.addInTeam(new Footman(32, "Fedor", new Melee("Knife", 12),
                new ShieldFootman("Paper", 1, 12)));
        footmanTeam.addInTeam(new Footman(30, "Georg", new Melee("Axe", 15),
                new ShieldFootman("Wood", 3, 13)));

        for (Footman item : footmanTeam
             ) {
            System.out.println(item);
        }
        System.out.println("Общее здоровье команды - " + footmanTeam.getTeamHelth());
        System.out.println("Максимальная дальность команды - "  + footmanTeam.getTeamRange());
        System.out.println("Общее нападение команды - " + footmanTeam.getTeamDamage());
        System.out.println("Слабое звено команды - игрок с минимальной защитой - " + footmanTeam.getMinProtection());

        System.out.println("------------------");

        Team<BaseHero> baseTeam = new Team<>();

        baseTeam.addInTeam(new Footman(15, "Semen", new Melee("knife", 10),
                new ShieldFootman("Wool", 2, 15)));
        baseTeam.addInTeam(new Archer(15, "Semen",
                new Ranged("Arche", 45, 120),
                new ShieldsArcher("Gold", 10)));


        for (BaseHero item : baseTeam
             ) {
            System.out.println(item);
        }
        System.out.println("Общее здоровье команды - " + baseTeam.getTeamHelth());
        System.out.println("Максимальная дальность команды - "  + baseTeam.getTeamRange());
        System.out.println("Общее нападение команды - " + baseTeam.getTeamDamage());
        System.out.println("Слабое звено команды - игрок с минимальной защитой - " + baseTeam.getMinProtection());

        Footman footman1 = new Footman(200, "Boris",
                new Melee("Pen", 45),
                new ShieldFootman("Paper", 1, 25));
        Footman footman2 = new Footman(230, "Vlad",
                new Melee("Pensel", 40),
                new ShieldFootman("Iron", 25, 14));

        while (footman1.getHelth() > 0 && footman2.getHelth() > 0){
            footman1.hitSomebody(footman2);
            System.out.println("После удара - " + footman2);
            System.out.println("Защита сработала на " + footman2.getShield().protection());
            footman2.hitSomebody(footman1);
            System.out.println("После удара - " + footman1);
            System.out.println("Защита сработала на " + footman1.getShield().protection());
        }

        if (footman1.getHelth() > 0){
            System.out.println("Победил первый игрок! ");
        } else {
            System.out.println("Победил второй игрок!!!");
        }






    }
}
