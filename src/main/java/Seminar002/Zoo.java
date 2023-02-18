package Seminar002;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animals> zoo = new ArrayList<>();

    private Radio radio = new Radio();


    public List<Animals> addAnimals (List<Animals> zooList){
        this.zoo.addAll(zooList);
        return this.zoo;
    }

    public List<Animals> getZoo() {
        return zoo;
    }

   public List<Sayable> getSayable(){

       List<Sayable> result = new ArrayList<>();
       for (Animals item : zoo
            ) {
           result.add(item);
       }
       result.add(radio);
       return result;
   }

   public List<Runable> getRunable(){
       List<Runable> result = new ArrayList<>();
       for (Animals item : zoo
       ) {
           if (item instanceof Runable){
               result.add((Runable) item);
           }
       }
       return result;
   }

    public List<Flyable> getFlyable(){
        List<Flyable> result = new ArrayList<>();
        for (Animals item : zoo
        ) {
            if (item instanceof Flyable){
                result.add((Flyable) item);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animals item : zoo
        ) {
            if (item instanceof Swimable){
                result.add((Swimable) item);
            }
        }
        return result;
    }

    public String getRunChampion (){
        List<Runable> runAnimals = getRunable();
        Runable runWinner = runAnimals.get(0);
        for (Runable item : runAnimals
             ) {
            if(runWinner.speedOfRun() < item.speedOfRun()){
                runWinner = item;
            }
        }
        return "Чемпион по бегу в нашем зоопарке - " + runWinner;
    }

    public String getFlyChampion (){
        List<Flyable> flyAnimals = getFlyable();
        Flyable flyWinner = flyAnimals.get(0);
        for (Flyable item : flyAnimals
        ) {
            if(flyWinner.speedOfFly() < item.speedOfFly()){
                flyWinner = item;
            }
        }
        return "Чемпион по полетам в нашем зоопарке - " + flyWinner;
    }

    public String getSwimChampion (){
        List<Swimable> swimAnimals = getSwimable();
        Swimable swimWinner = swimAnimals.get(0);
        for (Swimable item : swimAnimals
        ) {
            if(swimWinner.speedOfSwim() < item.speedOfSwim()){
                swimWinner = item;
            }
        }
        return "Чемпион по плаванию в нашем зоопарке - " + swimWinner;
    }
}
