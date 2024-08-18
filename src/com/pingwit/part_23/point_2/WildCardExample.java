package com.pingwit.part_23.point_2;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {
    public static void main(String[] args) {
        String name = "Egorka";
        Object object = name;

        List<String> strings = new ArrayList<>();
//        List<Object> objects = strings;
//        objects.add(777);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());

        feedAnimals(animals);


        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Cat());

        feedAnimals(pets);

        // Pecs -> producer - extends, consumer - super
        System.out.println(animals);
        merge(animals, pets);
        System.out.println(animals);

        animals.addAll(pets);
    }

    static void feedAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    static void merge(List<? super Animal> to, List<? extends Animal> from) {
        to.get(0);

        for (Animal animal : from) {
            to.add(animal);
        }
    }

}

class Animal {
    void feed() {
        System.out.println("Animal is feeding");
    }
}

class Abrakadabra extends Animal {

}

class Pet extends Animal {
    void feed() {
        System.out.println("Pet is feeding");
    }

}

class Cat extends Pet {
    void feed() {
        System.out.println("Cat is feeding");
    }
}
