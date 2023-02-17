package Seminar002;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();

        zoopark.addAnimals(List.of(new Cat("Barsik"),
                new Dog("Rex"),
                new Cow("Burenka"),
                new Rabbit("Adolf"),
                new Duck("Клюква"),
                new Butterfly("Малютка"),
                new Shark("Пушистик")));

        for (Sayable item : zoopark.getSayable()
             ) {
            System.out.println(item.say() + item.toString());
        }


        System.out.println("------------------------------");

        for (Runable item : zoopark.getRunable()
             ) {
            System.out.println(item);
        }

        System.out.println("-------------------------------");

        for (Flyable item : zoopark.getFlyable()
        ) {
            System.out.println(item);
        }

        System.out.println("----------------------");

        System.out.println(zoopark.getRunChampion());

        System.out.println("---------------------");

        System.out.println(zoopark.getFlyChampion());

        System.out.println("---------------------");

        System.out.println(zoopark.getSwimChampion());

        }





}
