package com.pingwit.part_23.homework.task_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitDataList {
    public static void main(String[] args) {
        // Список фруктов
        List<Fruit> fruits = Arrays.asList(
                new Fruit("Orange", 10.5, "Citrus"),
                new Fruit("Lemon", 5.0, "Citrus"),
                new Fruit("Peach", 3.5, "Stone Fruit"),
                new Fruit("Plum", 2.0, "Stone Fruit"),
                new Fruit("Mango", 7.5, "Tropical"),
                new Fruit("Banana", 12.0, "Tropical"),
                new Fruit("Apple", 6.0, "Pome"),
                new Fruit("Pear", 4.0, "Pome"));
        // Группировка фруктов по типу
        Map<String, List<Fruit>> groupedFruits = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getType));
        // Подсчет суммарного веса фруктов для каждого типа
        Map<String, Double> totalWeightByType = fruits.stream()
                .collect(Collectors.groupingBy(Fruit::getType,
                        Collectors.summingDouble(Fruit::getWeight)));
        // Вывод данных
        for (String type : groupedFruits.keySet()) {
            // Сортировка фруктов по названию внутри группы
            List<Fruit> sortedFruits = groupedFruits.get(type).stream()
                    .sorted(Comparator.comparing(Fruit::getName))
                    .collect(Collectors.toList());
            // Вывод фруктов
            for (Fruit fruit : sortedFruits) {
                System.out.println("-" + fruit);
            }
            // Вывод общего веса для типа
            System.out.println("Total weight for " + type + ": " + totalWeightByType.get(type) + " kg");
            System.out.println();
        }
    }
}