package com.pingwit.part_25.homework.task_2;

import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;

public class PhoneCollection {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("XS", "Apple", 1200),
                new Phone("P30", "Huawei", 800),
                new Phone("9T", "OnePlus", 900),
                new Phone("N60", "OPPO", 1400),
                new Phone("S23 plus", "Samsung", 1200),
                new Phone("S23 ultra", "Samsung", 1750),
                new Phone("Redmi note 9 pro", "Xiaomi", 450)
        );

        List<String> allowedProducers = List.of("Apple", "Samsung", "Xiaomi");

        List<String> preferredPhones = phones.stream()
                .filter(phone -> allowedProducers.contains(phone.producer()))
                .map(Phone::producer)
                .distinct()
                .toList();

        System.out.println("Список нужных производиделей: " + preferredPhones);
    }
}