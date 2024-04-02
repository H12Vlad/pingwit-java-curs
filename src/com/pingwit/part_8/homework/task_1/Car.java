package com.pingwit.part_8.homework.task_1;


public class Car {
    private String brand;
    private String model;
    private int doors;

    public Car(String brand, String model, int numbersOfDoors) {
        this.brand = brand;
        this.model = model;
        this.doors = numbersOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumbersOfDoors() {
        return doors;
    }

    public void setNumbersOfDoors(int numbersOfDoors) {
        this.doors = numbersOfDoors;
    }
}

