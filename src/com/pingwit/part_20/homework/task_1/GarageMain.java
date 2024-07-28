package com.pingwit.part_20.homework.task_1;

public class GarageMain {
    public static void main(String[] args) {
        Garage<BMW> garageBmw = new Garage<>();
        garageBmw.parked(new BMW("F31", "White"));
        garageBmw.parked(new BMW("F10", " Grey"));
        garageBmw.parked(new BMW("G20", "Black"));

        System.out.println("BMW Garage:");
        for (BMW bmw : garageBmw.getCars()) {
            System.out.println(bmw.getModel() + " " + bmw.getColor());
        }

        Garage<Tesla> garageTesla = new Garage<>();
        garageTesla.parked(new Tesla("Model_S", "Black"));
        garageTesla.parked(new Tesla("Cybertruck ", " Grey"));

        System.out.println("Tesla Garage:");
        for (Tesla tesla : garageTesla.getCars()) {
            System.out.println(tesla.getModel() + " " + tesla.getColor());
        }

        Garage<Car> garageAllTypesCars = new Garage<>();
        garageAllTypesCars.parked(new BMW("BMW: M3_Competition", "Black"));
        garageAllTypesCars.parked(new Tesla("Tesla: Model_Y", "Black"));

        System.out.println("Garage for all types of cars:");
        for (Car car : garageAllTypesCars.getCars()) {
            System.out.println(car.getModel() + " " + car.getColor());
        }

        System.out.println("Task_2 -> (number of black cars):");
        System.out.println("BMW Garage: " + garageBmw.countBlackCars("Black"));
        System.out.println("Tesla Garage: " + garageTesla.countBlackCars("Black"));
        System.out.println("Garage for all types of cars: " + garageAllTypesCars.countBlackCars("Black"));
    }
}