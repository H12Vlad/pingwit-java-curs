package com.pingwit.part_10.homework.task_2;

public class Transmission {
    private int currentGear;

    public void shiftUp() {
        int broadcastMax = 7;
        if (currentGear < broadcastMax) {
            currentGear++;
            System.out.println("Gear shifted up, current gear: " + currentGear);
        } else {
            System.out.println("Unable to change gear higher. Maximum gear reached.");
        }
    }

    public void shiftDown() {
        int broadcastMin = 0;
        if (currentGear > broadcastMin) {
            currentGear--;
            System.out.println("Gear shifted down, current gear: " + currentGear);
        } else {
            System.out.println("Unable to downshift. Minimum gear reached.");
        }
    }

    public int getCurrentGear() {
        return currentGear;
    }
}
