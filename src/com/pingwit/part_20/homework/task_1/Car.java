package com.pingwit.part_20.homework.task_1;

public abstract class Car {
     String model; // если модификатора доступа отсутствует - это default (т.е. package-private), а необходим protected
     String color; // если модификатора доступа отсутствует - это default (т.е. package-private), а необходим protected

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}