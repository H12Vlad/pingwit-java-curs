package com.pingwit.part_20.homework.task_1;

import java.util.ArrayList;
import java.util.List;

public class Garage<T extends Car> {
    private List<T> cars = new ArrayList<>();

// лишняя строка, удали
    public void parked(T car) { // parked -> park
        cars.add(car);
    }

    public List<T> getCars() {
        return cars;
    }
    public long countBlackCars() { // А давай в этот метод добавим аргумент color и тогда можно будет его использовать для подсчета автомобилей любого цвета
        return cars.stream()
                .filter(car -> "(Black)".equalsIgnoreCase(car.getColor())).
                count();
    }
}