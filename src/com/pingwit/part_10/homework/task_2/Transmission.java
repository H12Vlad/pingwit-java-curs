package com.pingwit.part_10.homework.task_2;

public class Transmission {
    int currentGear;

    public Transmission() {
        this.currentGear = currentGear;
    }


    public void shiftUp() {
        if (currentGear < 7) {
            currentGear++;
            System.out.println("Gear shifted up, current gear: " + currentGear);
        } else {
            System.out.println("Unable to change gear higher. Maximum gear reached.");
        }
    }

    public void shiftDown() {
        if (currentGear < 0) {
            currentGear++;
            System.out.println("Gear shifted down, current gear: " + currentGear);
        } else {
            System.out.println("Unable to downshift. Minimum gear reached.");
        }
    }
}
