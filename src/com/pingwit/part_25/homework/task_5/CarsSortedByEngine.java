package com.pingwit.part_25.homework.task_5;

import com.pingwit.part_25.homework.task_4.Car;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarsSortedByEngine {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Passat B8", "VW", 2016, "Diesel"),
                new Car("GLE 200", "Mercedes-Benz", 2019, "Petrol"),
                new Car("Golf 7", "VW", 2016, "Petrol"),
                new Car("A6C8", "Audi", 2016, "Electric"),
                new Car("Megan II", "Renault", 2016, "Diesel"),
                new Car("5008", "Peugeot", 2016, "Diesel"),
                new Car("Model X", "Tesla", 2021, "Electric")
        );
        Map<Boolean, List<Car>> carsByEngineType = cars.stream()
                .collect(Collectors.partitioningBy(car -> "Electric".equals(car.engineType())));

        carsByEngineType.forEach((isElectric, carList) -> {
            String group = isElectric ? "Электрические автомобили" : "Все остальные автомобили";
            System.out.println(group + ":");
            carList.forEach(car -> System.out.println(" - " + car));
        });
    }
}