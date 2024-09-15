package com.pingwit.part_25.point_3;

import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("XS", "Apple", 200),
//                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 200),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        phones.stream()
                .filter(phone -> phone.price() > 200)
                .findFirst()
                .ifPresent(System.out::println);

        phones.stream()
                .filter(phone -> phone.price() > 200)
                .findAny()
                .ifPresent(System.out::println);
    }
}
