package com.pingwit.part_9;

import com.pingwit.part_9.point_3.DogType;

public record RecordExample() {
    public static void main(String[] args) {
        Dog dog = new Dog(DogType.MOPS, "brown");
        Dog dogClone = new Dog(DogType.MOPS, "brown");

        dog.color();
        dog.type();

        System.out.println(dogClone);
        System.out.println(dog);
    }
}
