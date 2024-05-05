package com.pingwit.part_10.homework.task_2;

public class Car {
    private Engine engine;
    private Transmission transmission;


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
        int speed = transmission.currentGear * 20;
        System.out.println("Current speed: " + speed + "km/h");
    }
}
