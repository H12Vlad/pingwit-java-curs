package com.pingwit.part_20.homework.task_1;

public abstract class Car {
    private String model; // обычно поля у абстрактных классов делают protected, чтобы классы-наследники могли получить к ним доступ
    public String color; // обычно поля у абстрактных классов делают protected, чтобы классы-наследники могли получить к ним доступ

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
// удаляй код, который не используешь

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