package com.pingwit.part_11.homework.task_1;

public class Vehicle {
    private String licensePlate;
    private String type;
    private int numberOfPeople;
    private double mass;

    public Vehicle(String licensePlate, String type, int numberOfPeople, double mass) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.numberOfPeople = numberOfPeople;
        this.mass = mass;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getType() {
        return type;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getMass() {
        return mass;
    }
}