package com.pingwit.part_10.homework.task_2;

public class FunctionalityTesting {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.shiftUp();
        car.drive();

        car.shiftDown();
        car.drive();

        car.stopEngine();
        car.drive();
    }
}
