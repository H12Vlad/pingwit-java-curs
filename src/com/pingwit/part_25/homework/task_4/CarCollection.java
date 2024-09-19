package com.pingwit.part_25.homework.task_4;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarCollection {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Passat B8", "VW", 2016,"Diesel"),
                new Car("GLE 200", "Mercedes-Benz", 2019,"Petrol"),
                new Car("Golf 7", "VW", 2016,"Petrol"),
                new Car("A6C8", "Audi", 2016,"Electric"),
                new Car("Megan II", "Renault", 2016,"Diesel"),
                new Car("5008", "Peugeot", 2016,"Diesel"),
                new Car("Model X", "Tesla",2021, "Electric")
        );

        Map<String, List<Car>> carsByManufacturer = cars.stream()
                .collect(Collectors.groupingBy(Car::manufacturer));
        carsByManufacturer.forEach((manufacturer, carList) -> {
                    System.out.println(manufacturer);
                    System.out.println(carList);
                }
        );
    }
}