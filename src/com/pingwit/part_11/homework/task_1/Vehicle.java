package com.pingwit.part_11.homework.task_1;

import java.lang.reflect.Type;

public class Vehicle {
    private String licensePlate;
    private Type type;
    private int numberOfPeople;
    private double weight;

    public Vehicle(String licensePlate, String type, int numberOfPeople, double mass) {
        this.licensePlate = licensePlate;
        this.type = type.getClass();
        this.numberOfPeople = numberOfPeople;
        this.weight = weight;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public Type getType() {
        return type;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getMass() {
        return weight;
    }
}