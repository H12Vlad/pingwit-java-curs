package com.pingwit.part_20.homework.task_1;

public abstract class Car {
    private String model;
    public String color;

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

//class BMW extends Car {
//    public BMW(String model, String color) {
//        super(model, color);
//    }
//}

//class Tesla extends Car {
//    public Tesla(String model, String color) {
//        super(model, color);
//    }
//}