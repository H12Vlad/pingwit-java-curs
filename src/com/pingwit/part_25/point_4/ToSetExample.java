package com.pingwit.part_25.point_4;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
public class ToSetExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("XS", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 200),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000)
        );

        HashSet<Phone> uniquePhones = new HashSet<>(phones);

        Set<String> producers = phones.stream()
                .map(Phone::producer)
                .collect(Collectors.toSet());

        System.out.println(producers);
    }
}
