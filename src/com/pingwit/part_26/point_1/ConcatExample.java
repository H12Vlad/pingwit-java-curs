package com.pingwit.part_26.point_1;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.stream.Stream;
public class ConcatExample {
    public static void main(String[] args) {
        List<Phone> storageNewYork = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<Phone> storagePhiladelphia = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<Phone> storageCommon = Stream.concat(storageNewYork.stream(), storagePhiladelphia.stream())
                .toList();

        System.out.println(storageNewYork.size());
        System.out.println(storagePhiladelphia.size());
        System.out.println(storageCommon.size());

    }
}
