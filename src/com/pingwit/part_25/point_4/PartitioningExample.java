package com.pingwit.part_25.point_4;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
public class PartitioningExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 450),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000),
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 700),
                new Phone("8", "Apple", 600),
                new Phone("8", "Apple", 600),
                new Phone("8", "Apple", 400)
        );

        System.out.println("===simplePartitioning===");
        Map<Boolean, List<Phone>> simplePartitioning = phones.stream()
                .collect(Collectors.partitioningBy(phone -> phone.price() > 500));
        simplePartitioning.forEach((k,v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });

        System.out.println("===setPartitioningBy===");
        Map<Boolean, Set<Phone>> setPartitioningBy = phones.stream()
                .collect(Collectors.partitioningBy(phone -> phone.price() > 500, Collectors.toSet()));
        setPartitioningBy.forEach((k,v) -> {
            System.out.println(k);
            v.forEach(System.out::println);
        });
    }
}
