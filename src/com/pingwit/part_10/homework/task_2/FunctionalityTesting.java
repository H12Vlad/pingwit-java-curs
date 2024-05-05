package com.pingwit.part_10.homework.task_2;

public class FunctionalityTesting {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();
        Car car = new Car(engine, transmission);

        engine.stopEngine();
        car.drive();
        transmission.shiftUp();
        car.drive();
        engine.startEngine();
        car.drive();
    }
}
