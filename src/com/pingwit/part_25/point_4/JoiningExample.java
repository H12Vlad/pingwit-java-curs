package com.pingwit.part_25.point_4;
import com.pingwit.part_25.point_3.entity.Phone;
import com.pingwit.part_25.point_3.entity.PhoneProducer;

import java.util.List;
import java.util.stream.Collectors;
public class JoiningExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("S10", "Samsung", 1000),
                new Phone("3310", "Nokia", 1000),
                new Phone("8800", "Nokia", 2500)
        );

        String models = phones.stream()
                .map(Phone::model)
                .collect(Collectors.joining(";"));

        System.out.println(models);


        List<PhoneProducer> producers = List.of(
                new PhoneProducer("Apple", List.of("10, 11, 12pro, 12, 15 pro MAX")),
                new PhoneProducer("XIAOMI", List.of("ShurumBurum", "LaskiMasaski")),
                new PhoneProducer("Google", List.of("Pixel 7", "Pixel 8"))
        );

        List<String> csv = producers.stream()
                .map(PhoneProducer::models)
                .map(phoneModels -> String.join(",", phoneModels))
                .toList();
        csv.forEach(System.out::println);

    }
}
