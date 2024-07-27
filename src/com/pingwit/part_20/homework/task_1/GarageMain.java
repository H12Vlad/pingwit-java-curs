package com.pingwit.part_20.homework.task_1;

public class GarageMain {
    public static void main(String[] args) {
        Garage<GarageOnlyBMW> garageBmw = new Garage<>();
        garageBmw.parked(new GarageOnlyBMW("\tF31", "(White)"));
        garageBmw.parked(new GarageOnlyBMW("\tF10", "(Grey)"));
        garageBmw.parked(new GarageOnlyBMW("\tG20", "(Black)"));

        System.out.println("\nBMW Garage:");
        for (GarageOnlyBMW bmw : garageBmw.getCars()) {
            System.out.println(bmw.getModel() + " " + bmw.getColor());
        }


        Garage<GarageOnlyTesla> garageTesla = new Garage<>();
        garageTesla.parked(new GarageOnlyTesla("\tModel_S", "(Black)"));
        garageTesla.parked(new GarageOnlyTesla("\tCybertruck ", "(Grey)"));

        System.out.println("\nTesla Garage:");
        for (GarageOnlyTesla tesla : garageTesla.getCars()) {
            System.out.println(tesla.getModel() + " " + tesla.getColor());
        }


        Garage<Car> garageAllTypesCars = new Garage<>();
        garageAllTypesCars.parked(new GarageOnlyBMW("\tBMW: M3_Competition", "(Black)"));
        garageAllTypesCars.parked(new GarageOnlyTesla("\tTesla: Model_Y", "(Black)"));

        System.out.println("\nGarage for all types of cars:");
        for (Car car : garageAllTypesCars.getCars()) {
            System.out.println(car.getModel() + " " + car.getColor());
        }

        System.out.println("\nTask_2 -> (number of black cars):");
        System.out.println("\tBMW Garage: " + garageBmw.countBlackCars() + " " + "Black car");
        System.out.println("\tTesla Garage: " + garageTesla.countBlackCars() + " " + "Black car");
        System.out.println("\tGarage for all types of cars: " + garageAllTypesCars.countBlackCars() + " " + "Black car");
    }
}