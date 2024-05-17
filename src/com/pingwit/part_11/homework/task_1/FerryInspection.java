package com.pingwit.part_11.homework.task_1;

public class FerryInspection {
    private static final int MAX_PASSENGERS = 49;
    private static final int MAX_WEIGHT = 14999;

    public boolean isFerryAllowedToSail(Vehicle[] vehicles) {
        int totalPassengers = 0;
        double totalMass = 0;

        for (Vehicle vehicle : vehicles) {
            totalPassengers += vehicle.getNumberOfPeople();
            totalMass += vehicle.getMass();
        }
        return totalPassengers <= MAX_PASSENGERS && totalMass < MAX_WEIGHT;
    }
}