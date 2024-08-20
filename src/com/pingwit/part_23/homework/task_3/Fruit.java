package com.pingwit.part_23.homework.task_3;

public record Fruit(String name, double weight, String type) implements Comparable<Fruit> {
    @Override
    public int compareTo(Fruit fruit) {
        int nameResult = this.name.compareTo(fruit.name());
        if (nameResult != 0) {
            return nameResult;
        }
        int typeResult = this.type.compareTo(fruit.type());
        if (typeResult != 0) {
            return typeResult;
        }
        return Double.compare(this.weight, fruit.weight);
    }
}