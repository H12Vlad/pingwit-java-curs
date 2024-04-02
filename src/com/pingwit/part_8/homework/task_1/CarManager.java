package com.pingwit.part_8.homework.task_1;

public class CarManager {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("Toyota", "Camry", 4);
        cars[1] = new Car("Audi", "A3", 3);
        cars[2] = new Car("VW", "Passat", 5);

        openDoors(cars);
    }

    public static void openDoors(Car[] cars) {
        for (Car car : cars) {
            if ("Audi".equals(car.getBrand())) {
                System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel());
                for (int i = 1; i <= car.getNumbersOfDoors(); i++) {
                    System.out.println("Дверь" + " " + i + " " + "открыта");
                }
            }
        }
    }
}
