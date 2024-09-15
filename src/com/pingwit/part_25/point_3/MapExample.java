package com.pingwit.part_25.point_3;

import com.pingwit.part_25.point_3.entity.Phone;
import com.pingwit.part_25.point_3.entity.ShortenPhone;

import java.util.List;
public class MapExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("XS", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 200),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000)
        );

        List<ShortenPhone> shortenPhones = phones.stream()
                .filter(phone -> phone.price() > 300)
                .map(phone -> new ShortenPhone(phone.model(), phone.producer()))
                .toList();

        System.out.println(phones);
        System.out.println(shortenPhones);

        List<String> phonesModels = phones.stream()
                .map(Phone::model)
                .toList();

        System.out.println(phonesModels);
    }
}
