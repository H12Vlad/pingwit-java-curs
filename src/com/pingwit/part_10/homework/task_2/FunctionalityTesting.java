package com.pingwit.part_10.homework.task_2;

public class FunctionalityTesting {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Transmission transmission = new Transmission();
        Car car = new Car(engine, transmission);

        engine.stopEngine();// все управление автомобилем в методе main только через переменную car
        car.drive();
        transmission.shiftUp(); // все управление автомобилем в методе main только через переменную car
        car.drive();
        engine.startEngine();// все управление автомобилем в методе main только через переменную car
        car.drive();
    }
}
