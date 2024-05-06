package com.pingwit.part_10.homework.task_2;

public class Transmission {
    int currentGear;// поля класса сделай приватными

    public Transmission() {
        this.currentGear = currentGear; // в этой строке нету смысла, конструктор не принимает аргументов, поэтому ты полю this.currentGear присваиваешь его же значение, т.е. 0, т.к. это примитив
    }

// лишняя строка, удали
    public void shiftUp() {
        if (currentGear < 7) { // 7 - это магическое число, вынеси в константу
            currentGear++;
            System.out.println("Gear shifted up, current gear: " + currentGear);
        } else {
            System.out.println("Unable to change gear higher. Maximum gear reached.");
        }
    }

    public void shiftDown() {
        if (currentGear < 0) { // 0 - это магическое число, вынеси в константу
            currentGear++;
            System.out.println("Gear shifted down, current gear: " + currentGear);
        } else {
            System.out.println("Unable to downshift. Minimum gear reached.");
        }
    }
}
