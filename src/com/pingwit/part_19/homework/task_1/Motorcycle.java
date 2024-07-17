package com.pingwit.part_19.homework.task_1;

import java.io.Serializable;

public class Motorcycle implements Serializable {
    private static final long serialVersionUID = 7061636L;
    private String brand;
    public String model;
    private Engine engine;

    public Motorcycle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}