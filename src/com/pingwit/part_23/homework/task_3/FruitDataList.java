package com.pingwit.part_23.homework.task_3;

import java.util.*;

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
        //Map для хранения сгруппированных фруктов и их общего веса
        Map<String, List<Fruit>> groupedFruits = new HashMap<>();
        Map<String, Double> totalWeightByType = new HashMap<>();
        // Группировка фруктов по типу, подсчет веса и сортировка по названию
        for (Fruit fruit : fruits) {
            String type = fruit.getType();
            // Группировка фрукта по типу
            if (!groupedFruits.containsKey(type)) {
                groupedFruits.put(type, new ArrayList<>());
                totalWeightByType.put(type, 0.0);
            }
            // Добавления фрукта в соответствующий список
            groupedFruits.get(type).add(fruit);
            // Суммируем вес
            totalWeightByType.put(type, totalWeightByType.get(type) + fruit.getWeight());
        }
        // Сортировка фруктов в каждой группе по названию
        for (List<Fruit> fruitList : groupedFruits.values()) {
            fruitList.sort(new Comparator<Fruit>() {
                @Override
                public int compare(Fruit f1, Fruit f2) {
                    return f1.getName().compareTo(f2.getName());
                }
            });
        }
        // Вывод данных
        for (String type : groupedFruits.keySet()) {
            System.out.println("Type: " + type);
            // Вывод фруктов
            for (Fruit fruit : groupedFruits.get(type)) {
                System.out.println(" - " + fruit);
            }
            // Вывод общего веса для типа
            System.out.println("Total weight for " + type + ": " + totalWeightByType.get(type) + " kg");
            System.out.println();
        }

        /* ты сейчас заменил стримы на обычные циклы, это первый шаг, но у тебя сейчас 4 цикла
        1. for (Fruit fruit : fruits) {
        2. for (List<Fruit> fruitList : groupedFruits.values()) {
        3. for (String type : groupedFruits.keySet()) {
        4. for (Fruit fruit : groupedFruits.get(type)) {

        Тебе необходимо переписать код, чтобы осталось 2 цикла
        1. Ты выполняешь все необходимые вычисления (группировка по типу+подсчет веса)
        2. Выводишь на экран
         */
    }
}