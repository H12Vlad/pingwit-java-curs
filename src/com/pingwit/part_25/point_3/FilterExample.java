package com.pingwit.part_25.point_3;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.stream.Collectors;
public class FilterExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("XS", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 200),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<Phone> filteredPhones = phones.stream()
                .filter(phone -> phone.price() > 300)
                .filter(phone -> phone.price() > 500)
                .filter(phone -> phone.producer().startsWith("S"))
                .toList();
//                .collect(Collectors.toList());
        System.out.println(phones);
        System.out.println(filteredPhones);
    }
}
