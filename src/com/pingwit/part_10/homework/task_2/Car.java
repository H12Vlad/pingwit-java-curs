package com.pingwit.part_10.homework.task_2;

public class Car {
    private Engine engine;
    private Transmission transmission;

// лишняя строка, удали
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public void drive() {
        if (!engine.isRunning) {
            System.out.println("I can’t go, the engine is not running.");
            return;
        }
        transmission.shiftUp();
        int speed = transmission.currentGear * 20;// 20 - это магическое число, вынеси в константу
        System.out.println("Current speed: " + speed + "km/h");
    }
}
