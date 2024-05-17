package com.pingwit.part_10.homework.task_2;

public class Car implements CarDetails {
    private Engine engine;
    private Transmission transmission;
    private static final int RATIO = 20;

    public Car() {
        engine = new Engine();
        transmission = new Transmission();
    }

    @Override
    public void drive() {
        if (!engine.isRunning()) {
            System.out.println("I can’t go, the engine is not running.");
            return;
        }
        int speed = transmission.getCurrentGear() * RATIO;
        System.out.println("Current speed: " + speed + "km/h");
    }

    @Override
    public void startEngine() {
        engine.start();
    }

    @Override
    public void stopEngine() {
        engine.stop();
    }

    @Override
    public void shiftUp() {
        transmission.shiftUp();
    }

    @Override
    public void shiftDown() {
        transmission.shiftDown();
    }
}