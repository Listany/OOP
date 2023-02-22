package Seminar003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Ivan", "Petrov", 25);
        User user2 = new User("Serg", "Ivanov", 30);
        User user3 = new User("Grigory", "Rakov", 21);


        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(new User("Zinaida", "Pupkina", 84));
        users.add(new User("Ivan", "Petrov", 110));
        users.add(new User("Ivan", "Petrov", 78));

        Personal personal = new Personal(users);

        for (User user: personal
             ) {
            System.out.println(user);
        }

        System.out.println("-------------------");

        List<User> userList = personal.toList();
        
        Collections.sort(userList);

        for (User user : userList
             ) {
            System.out.println(user);
        }

        System.out.println("----------------------");


        // делаем новый список, с учетом нового типа в юзерах

        User gendir = new User("Vladimir", "Vladimirovich", 70);
        User director = new User("Kuzma", "Shishkin", 52);
        User boss = new User("Semen", "Slepakov", 42);
        User manager1 = new User("Jenifer", "Lopes", 47);
        User manager2 = new User("Jim", "Carry", 53);
        User manager3 = new User("Ivan", "Susanin", 68);

        ArrayList<User> managersArr = new ArrayList<>();
        managersArr.add(manager1);
        managersArr.add(manager2);
        Personal managers1 = new Personal(managersArr); // младшие менеджеры

        ArrayList<User> managersArr2 = new ArrayList<>();
        managersArr2.add(manager3);
        Personal managers2 = new Personal(managersArr2); // старшие менеджеры

        ArrayList<User> chiefsArr = new ArrayList<>();
        chiefsArr.add(director);
        chiefsArr.add(boss);
        Personal chiefs = new Personal(chiefsArr); // руководство

        gendir.setPersonal(chiefs);
        director.setPersonal(managers2);
        boss.setPersonal(managers1);
        
        Company company = new Company(gendir);

        for (User user : company
             ) {
            System.out.println(user);
        }





    }
}
