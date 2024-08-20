package com.pingwit.part_23.homework.task_3;

import java.math.BigDecimal; // лишний импорт
import java.util.*;

public class FruitDataList {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("Orange", 10.5, "Citrus"));
        fruits.add(new Fruit("Lemon", 5.0, "Citrus"));
        fruits.add(new Fruit("Peach", 3.5, "Stone FruitTheEnd"));
        fruits.add(new Fruit("Plum", 2.0, "Stone FruitTheEnd"));
        fruits.add(new Fruit("Mango", 7.5, "Tropical"));
        fruits.add(new Fruit("Banana", 12.0, "Tropical"));
        fruits.add(new Fruit("Apple", 6.0, "Pome"));
        fruits.add(new Fruit("Pear", 4.0, "Pome"));
        Map<String, List<Fruit>> fruitsByType = new HashMap<>();

        for (Fruit fruit : fruits) {
            if (fruitsByType.containsKey(fruit.type())) {
                List<Fruit> groupedFruits = fruitsByType.get(fruit.type());
                groupedFruits.add(fruit);
            } else {
                List<Fruit> groupedFruits = new ArrayList<>();
                groupedFruits.add(fruit);
                fruitsByType.put(fruit.type(), groupedFruits);
            }
        }

        fruitsByType.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

        fruitsByType.forEach((type, fruitList) -> {
            fruitList.sort(Comparator.comparing(Fruit::name));
            double totalWeight = fruitList.stream().mapToDouble(Fruit::weight).sum(); // сам написал или гугл? Если сам, то красавчик, если гугл, то перепиши без стримов.
            System.out.println("Type: " + type);
            System.out.println("Total weight: " + totalWeight + " kg");
            System.out.println("Fruit:");
            fruitList.forEach(fruit -> System.out.println("  - " + fruit.name() + " (" + fruit.weight() + " kg)"));
            System.out.println("===");
        });

        // не совсем то что я просил, но очень неплохо
    }
}