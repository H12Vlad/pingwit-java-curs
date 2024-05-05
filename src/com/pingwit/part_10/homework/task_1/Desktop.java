package com.pingwit.part_10.homework.task_1;

public class Desktop implements Computer {
    @Override
    public void powerOn() {
        System.out.println("Desktop computer is powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println("Desktop computer is powering off...");
    }

    @Override
    public void reset() {
        System.out.println("Desktop computer is resetting...");
    }
}
