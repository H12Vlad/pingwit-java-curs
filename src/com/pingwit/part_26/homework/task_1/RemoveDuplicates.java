package com.pingwit.part_26.homework.task_1;

import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("XS", "Apple", 1200),
                new Phone("XS", "Apple", 1200),
                new Phone("P30", "Huawei", 800),
                new Phone("9T", "OnePlus", 900),
                new Phone("9T", "OnePlus", 900),
                new Phone("S23 plus", "Samsung", 1200),
                new Phone("Redmi note 9 pro", "Xiaomi", 450),
                new Phone("S23 plus", "Samsung", 1200)
        );

        List<Phone> uniquePhones = phones.stream()
                .distinct()
                .toList();
        uniquePhones.forEach(System.out::println);
    }
}