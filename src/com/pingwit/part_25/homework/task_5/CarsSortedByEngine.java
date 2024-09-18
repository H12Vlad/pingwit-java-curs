package com.pingwit.part_25.homework.task_5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarsSortedByEngine {
    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Passat B8", "VW", "Diesel"),
                new Car("Golf 7", "VW", "Petrol"),
                new Car("5008", "PeugeotW", "Diesel"),
                new Car("E-Tron", "Audi", "Electric"),
                new Car("Model X", "Tesla", "Electric")
        );
        // в задаче цель разделить коллекцию на 2 части, а у тебя 3 получилось, вместо groupingBy необходимо использовать partitioningBy()
        Map<String, List<Car>> carsEngine = cars.stream()
                .collect(Collectors.groupingBy(Car::engineType)
                );// это продолжение 18ой строки, не нужен абзац
        carsEngine.forEach((engine, carList) ->
                System.out.println(engine) // выведи еще на экран какие автомобили к какой группе относятся
        );

        System.out.println(carsEngine);
    }
}