package com.pingwit.part_26.point_1;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class DistinctExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("Xs", "Apple", 200),
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000)
        );

        Set<Phone> set = phones.stream()
                .collect(Collectors.toSet());

        List<Phone> uniqueList = phones.stream()
                .distinct()
                .toList();

        System.out.println(set);
        System.out.println(uniqueList);
    }
}
