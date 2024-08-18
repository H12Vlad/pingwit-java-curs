package com.pingwit.part_23.homework.task_3;

public class Fruit {
    private String name;
    private double weight;
    private String type;

    public Fruit(String name, double weight, String type) {
        this.name = name;
        this.weight = weight;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}