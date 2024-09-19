package com.pingwit.part_26.point_1;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
public class SkipLimitExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("8800", "Nokia", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("3310", "Nokia", null)
        );

        List<Phone> sublist = phones.stream()
                .skip(2)
                .limit(20)
                .toList();

        System.out.println(sublist.size());
        System.out.println(sublist);
    }
}
