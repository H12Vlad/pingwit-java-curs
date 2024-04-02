package com.pingwit.part_8.homework.task_3;

public class CityApartmentBuilding {
    private int floors;
    private boolean heatingOn;
    private int residents;

    public CityApartmentBuilding(int numberOfFloors, boolean heatingOn, int numberOfResidents) {
        this.floors = numberOfFloors;
        this.heatingOn = heatingOn;
        this.residents = numberOfResidents;
    }

    public int getNumberOfFloors() {
        return floors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.floors = numberOfFloors;
    }

    public boolean isHeatingOn() {
        return heatingOn;
    }

    public void turnOnHeating() {
        heatingOn = true;
    }

    public int getNumberOfResidents() {
        return residents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.residents = numberOfResidents;
    }
}