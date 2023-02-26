package Seminar003Homework;


import java.util.ArrayList;
import java.util.Iterator;


public class LinkedList implements Iterable<Car> {

    private ArrayList <Car> carList;

    public LinkedList(String model, int year, int speed, ArrayList<Car> carList) {
        this.carList = carList;
    }

    public Iterator<Car> iterator() {
        return new Iterator<Car>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < carList.size();
            }

            @Override
            public Car next() {
                return carList.get(index++);
            }
        };
    }

    /*public ArrayList<Car> toCarList(ArrayList<Car> carList1, Car car){
        carList1.add(car);
        if (carList1.size() != 1){
            carList1.get(carList1.size() - 2).setIndexNext(carList1.size() - 1);
        }
        return carList1;
    }*/








}
