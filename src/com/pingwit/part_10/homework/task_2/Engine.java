package com.pingwit.part_10.homework.task_2;

public class Engine {
    boolean isRunning;

    public Engine() {
        this.isRunning = false;
    }

    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The engine is running");
        } else {
            System.out.println("The engine is running");
        }
    }

    public void stopEngine() {
        if (!isRunning) {
            isRunning = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("The engine is already stopped");
        }
    }

}
