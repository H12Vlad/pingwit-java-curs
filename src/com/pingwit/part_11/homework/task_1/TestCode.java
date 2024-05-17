package com.pingwit.part_11.homework.task_1;

public class TestCode {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Vehicle("A123BC", "car", 2, 1500),
                new Vehicle("B456CD", "car", 5, 1700),
                new Vehicle("B456CD", "car", 4, 1900),
                new Vehicle("C789DE", "track", 2, 7000),
                new Vehicle("D012EF", "track", 1, 8000),
        };

        FerryToll ferryToll = new FerryToll();
        ferryToll.calculateAndPrintToll(vehicles);

        FerryInspection ferryInspection = new FerryInspection();
        boolean isAllowedToSail = ferryInspection.isFerryAllowedToSail(vehicles);

        if (isAllowedToSail) {
            System.out.println("Flight cleared");
        } else {
            System.out.println("Flight not allowed");
        }
    }
}