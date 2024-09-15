package com.pingwit.part_25.point_3;
import com.pingwit.part_25.point_3.entity.PhoneProducer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(List.of(1, 2, 3));
        list.add(List.of(4, 5, 6));
        list.add(List.of(7, 8, 9));

        List<Integer> lineNumbers = list.stream()
                .flatMap(Collection::stream)
                .filter(x -> x > 3)
                .map(x -> ++x)
                .toList();

        System.out.println(lineNumbers);

        List<PhoneProducer> producers = List.of(
                new PhoneProducer("Apple", List.of("10, 11, 12pro, 12, 15 pro MAX")),
                new PhoneProducer("XIAOMI", List.of("ShurumBurum", "LaskiMasaski")),
                new PhoneProducer("Google", List.of("Pixel 7", "Pixel 8"))
        );

        List<String> models = producers.stream()
                .map(PhoneProducer::models)
                .flatMap(Collection::stream)
                .toList();

        System.out.println(models);
    }
}
