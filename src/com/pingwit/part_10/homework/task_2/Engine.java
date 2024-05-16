package com.pingwit.part_10.homework.task_2;

public class Engine {
    private boolean isRunning;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) { // этот метод можно удалить
        isRunning = running;
    }

    public void start() {
        if (isRunning) {
            System.out.println("The engine is already running");
        } else {
            isRunning = true;
            System.out.println("The engine is running");
        }
    }

    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("The engine is already stopped");
        }
    }
}
