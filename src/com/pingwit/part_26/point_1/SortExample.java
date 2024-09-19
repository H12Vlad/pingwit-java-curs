package com.pingwit.part_26.point_1;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class SortExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("15", "Apple", 200),
                new Phone("Xs", "Apple", 100),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<Phone> sortedPhones = phones.stream()
                .sorted(Comparator.comparing(Phone::price).thenComparing(Phone::model))
                .toList();

        System.out.println("===phones===");
        System.out.println(phones);
        System.out.println("===sortedPhones===");
        System.out.println(sortedPhones);

        ArrayList<Phone> collectionsSort = new ArrayList<>(phones);
        Collections.sort(collectionsSort, Comparator.comparing(Phone::price).thenComparing(Phone::model));
        System.out.println("===Collections.sort===");
        System.out.println(collectionsSort);

        phones.stream()
                .sorted(Comparator.comparing(Phone::price).thenComparing(Phone::model))
                .filter(phone -> phone.price() < 250)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
