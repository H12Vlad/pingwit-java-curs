package com.pingwit.part_10.homework.task_2;

public class Engine {
    boolean isRunning;// поля класса сделай приватными

    public Engine() {
        this.isRunning = false; // в этой строке нету необходимости, значение false примитиву boolean будет автоматически присвоено при создании экземпляра класса (new Engine())
    }

    public void startEngine() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("The engine is running");
        } else {
            System.out.println("The engine is running");
        }

        // лучше избегать отрицания в коде, можно изменить твой код вот так и будет тоже самое
        /*if (isRunning) {
            System.out.println("The engine is running");
        } else {
            isRunning = true;
            System.out.println("The engine is running");
        }*/
    }

    public void stopEngine() {
        if (!isRunning) { // если двигатель включен, то выключить двигатель, а у тебя наоборот пока, думаю "!" здесь лишний
            isRunning = false;
            System.out.println("Engine stopped");
        } else {
            System.out.println("The engine is already stopped");
        }
    }

}
