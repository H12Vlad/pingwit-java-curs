package com.pingwit.part_20.homework.task_1;

public class GarageMain {
    public static void main(String[] args) {
        Garage<GarageOnlyBMW> garageBmw = new Garage<>();
        garageBmw.parked(new GarageOnlyBMW("\tF31", "(White)")); // а зачем тебе здесь /t? Такие проблемы могут вызывать проблемы в работе программы, поскольку переменная будет хранить странные пробелы
        garageBmw.parked(new GarageOnlyBMW("\tF10", "(Grey)")); // а зачем тебе здесь /t?
        garageBmw.parked(new GarageOnlyBMW("\tG20", "(Black)")); // а зачем тебе здесь /t?

        System.out.println("\nBMW Garage:");
        for (GarageOnlyBMW bmw : garageBmw.getCars()) {
            System.out.println(bmw.getModel() + " " + bmw.getColor());
        }


        Garage<GarageOnlyTesla> garageTesla = new Garage<>();
        garageTesla.parked(new GarageOnlyTesla("\tModel_S", "(Black)")); // а зачем тебе здесь /t?        (Black) -> Black
        garageTesla.parked(new GarageOnlyTesla("\tCybertruck ", "(Grey)")); // а зачем тебе здесь /t?     (Grey) -> Grey

        System.out.println("\nTesla Garage:");
        for (GarageOnlyTesla tesla : garageTesla.getCars()) {
            System.out.println(tesla.getModel() + " " + tesla.getColor());
        }


        Garage<Car> garageAllTypesCars = new Garage<>();
        garageAllTypesCars.parked(new GarageOnlyBMW("\tBMW: M3_Competition", "(Black)")); // а зачем тебе здесь /t?     (Black) -> Black
        garageAllTypesCars.parked(new GarageOnlyTesla("\tTesla: Model_Y", "(Black)")); // а зачем тебе здесь /t?        (Black) -> Black

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