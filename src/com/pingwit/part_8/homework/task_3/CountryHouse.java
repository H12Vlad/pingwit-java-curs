package com.pingwit.part_8.homework.task_3;

public class CountryHouse {
    private int numberOfFloors; // numberOfFloors -> floors
    private boolean heatingOn;
    private int numberOfResidents; // numberOfResidents -> residents

    public CountryHouse(int numberOfFloors, boolean heatingOn, int numberOfResidents) {
        this.numberOfFloors = numberOfFloors;
        this.heatingOn = heatingOn;
        this.numberOfResidents = numberOfResidents;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    public void turnOnHeating() {
        heatingOn = true;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }
}