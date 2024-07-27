package com.pingwit.part_20.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Car> {
    private List<T> cars = new ArrayList<>();


    public void parked(T car) {
        cars.add(car);
    }

    public List<T> getCars() {
        return cars;
    }
    public long countBlackCars() {
        return cars.stream()
                .filter(car -> "(Black)".equalsIgnoreCase(car.getColor())).
                count();
    }
}