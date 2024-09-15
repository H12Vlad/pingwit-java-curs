package com.pingwit.part_25.point_4;
import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class ToMapExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("S10", "Samsung", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("8800", "Nokia", 2500)
        );

        Map<String, String> modelsByProducers = phones.stream()
                .collect(Collectors.toMap(Phone::model, Phone::producer));
        System.out.println(modelsByProducers);

        Map<String, Phone> phonesByProducers = phones.stream()
                .collect(Collectors.toMap(Phone::producer, Function.identity()));
        System.out.println(phonesByProducers);
    }
}
