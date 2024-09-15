package com.pingwit.part_25.point_4;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.*;
import java.util.stream.Collectors;
public class GroupingByExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 450),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 700),
                new Phone("8", "Apple", 700),
                new Phone("8", "Apple", 600),
                new Phone("8", "Apple", 400)
        );

        System.out.println("===simpleGroupingBy===");
        Map<String, List<Phone>> simpleGroupingBy = phones.stream()
                .collect(Collectors.groupingBy(Phone::producer));
        simpleGroupingBy.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        System.out.println("===toSetGroupingBy===");
        Map<String, Set<Phone>> toSetGroupingBy = phones.stream()
                .collect(Collectors.groupingBy(Phone::producer, Collectors.toSet()));
        toSetGroupingBy.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        System.out.println("===treeMapGroupingBy===");
        TreeMap<String, Set<Phone>> treeMapGroupingBy = phones.stream()
                .collect(Collectors.groupingBy(Phone::producer, TreeMap::new, Collectors.toSet()));
        treeMapGroupingBy.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        System.out.println("===treeMapWithTreeSetGroupingBy===");
        TreeMap<String, TreeSet<Phone>> treeMapWithTreeSetGroupingBy = phones.stream()
                .collect(Collectors.groupingBy(
                        Phone::producer,
                        TreeMap::new,
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparingInt(Phone::price).reversed())))
                );
        treeMapWithTreeSetGroupingBy.forEach((k, v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }
}
