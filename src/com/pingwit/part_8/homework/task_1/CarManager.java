package com.pingwit.part_8.homework.task_1;

import com.pingwit.part_8.homework.task_1.Car; // если классы находятся в одном пакете, то импорт не нужен

public class CarManager {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("Toyota", "Camry", 4);
        cars[1] = new Car("Audi", "A3", 3);
        cars[2] = new Car("VW", "Passat", 5);

        openAudiDoors(cars);
    }

    //openAudiDoors -> openDoors (String brand, Car[] cars) - так метод будет более обобщенный и можно будет использовать для других моделей
    public static void openAudiDoors(Car[] cars) {
        for (Car car : cars) {
            if (car.getBrand().equals("Audi")) { // лучше наоборот -> "Audi".equals(car.getBrand()), тогда не будет NullPointerException, если car.getBrand() вернет null
                System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel());
                for (int i = 1; i <= car.getNumbersOfDoors(); i++) {
                    System.out.println("Дверь" + " " + i + " " + "открыта");
                }
                System.out.println(); // я думаю этот вызов не нужен
            }
        }
    }
}
