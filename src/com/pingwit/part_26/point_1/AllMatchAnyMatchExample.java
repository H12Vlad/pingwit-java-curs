package com.pingwit.part_26.point_1;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;

public class AllMatchAnyMatchExample {
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

        boolean allMatchResult = phones.stream()
                .allMatch(phone -> phone.price() > 300);

        boolean anyMatchResult = phones.stream()
                .filter(phone -> phone.price() != null)
                .anyMatch(phone -> phone.price() > 300);

        System.out.println("allMatchResult=" + allMatchResult);
        System.out.println("anyMatchResult=" + anyMatchResult);
    }
}
