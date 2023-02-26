package Seminar003Homework;

import Seminar003.User;

import java.util.ArrayList;
import java.util.Iterator;

public class Car implements Iterable <Car> {
    private String model;
    private int year;
    private int speed;

    private int indexNext;

    private ArrayList<Car> carArrayList = new ArrayList<>();


    public Car(String model, int year, int speed) {
        this.model = model;
        this.year = year;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public int getIndexNext() {
        return indexNext;
    }

    public void setIndexNext(int indexNext) {
        this.indexNext = indexNext;
    }

    public ArrayList<Car> toCarList(ArrayList<Car> carList1, Car car){

        carList1.add(car);
        if (carList1.size() != 1){
            carList1.get(carList1.size() - 2).setIndexNext(carList1.size() - 1);
        }
        return carList1;
    }

    @Override
    public Iterator<Car> iterator() {
        return new Iterator<Car>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < carArrayList.size();
            }

            @Override
            public Car next() {
                return carArrayList.get(index++);
            }
        };
    }
}
