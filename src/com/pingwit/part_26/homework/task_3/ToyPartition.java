package com.pingwit.part_26.homework.task_3;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToyPartition {
    public static void main(String[] args) {
        List<TreeToy> toys = List.of(
                new TreeToy("Шар", true),
                new TreeToy("Звезда", true),
                new TreeToy("Сосулька", false),
                new TreeToy("Колокольчик", true),
                new TreeToy("Фигурка снеговика", false)
        );

        Map<Boolean, List<TreeToy>> partitionedToys = toys.stream()
                .collect(Collectors.partitioningBy(TreeToy::fixture));

        System.out.println("Игрушки с крепежом:");
        partitionedToys.get(true).forEach(System.out::println);

        System.out.println("Игрушки без крепежа:");
        partitionedToys.get(false).forEach(System.out::println);
    }
}