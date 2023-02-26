package Seminar003Homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mers", 1995, 130);
        Car car2 = new Car("Lada", 2005, 60);
        Car car3 = new Car ("VV", 2007, 180);

        ArrayList<Car> carList = new ArrayList<>();

        car1.toCarList(carList, car1);
        car2.toCarList(carList, car2);
        car3.toCarList(carList, car3);



        //System.out.println(carList);

        for (Car car : carList
             ) {
            System.out.println(car);
        }

        for (Car car : carList
             ) {
            System.out.println(car.getIndexNext());
        }

        System.out.println(car1.iterator().hasNext());

        System.out.println(carList.iterator().hasNext());






    }




}
