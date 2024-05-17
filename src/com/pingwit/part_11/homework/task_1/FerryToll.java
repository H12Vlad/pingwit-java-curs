package com.pingwit.part_11.homework.task_1;

public class FerryToll {
    private static final int TRACK_PRICE = 30;
    private static final int CAR_PRICE = 10;
    private static final int CAR_FULL = 15;
    private static final int DISCOUNT_PASSENGERS_QUANTITY = 2;

    public void calculateAndPrintToll(Vehicle[] vehicles) {
        int totalPassengers = 0;
        int totalToll = 0;

        for (Vehicle vehicle : vehicles) {
            if ("track".equals(vehicle.getType())) {
                totalToll += TRACK_PRICE;
            } else if ("car".equals(vehicle.getType())) {
                if (vehicle.getNumberOfPeople() <= DISCOUNT_PASSENGERS_QUANTITY) {
                    totalToll += CAR_PRICE;
                } else {
                    totalToll += CAR_FULL;
                }
            }
            totalPassengers += vehicle.getNumberOfPeople();
        }
        System.out.println("Total payment amount: " + totalToll + " Euro");
        System.out.println("Total number of passengers: " + totalPassengers);
    }
}