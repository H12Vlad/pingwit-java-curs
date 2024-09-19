package com.pingwit.part_26.homework.task_2;

import java.util.List;
import java.util.Optional;

public class FindBestHotel {
    public static void main(String[] args) {
        List<Hotel> hotels = List.of(
                new Hotel("Diamond Hotel", 4.5),
                new Hotel("Seaside Resort", 4.7),
                new Hotel("Mountain Lodge", 4.9),
                new Hotel("City Inn", 4.2),
                new Hotel("Country House", 4.6)
        );

        Optional<Hotel> bestHotel = Optional.ofNullable(hotels.stream()
                .reduce((h1, h2) -> h1.rating() >= h2.rating() ? h1 : h2)
                .orElseThrow(() -> new RuntimeException("Список отелей пуст!!!")));

        System.out.println("!!!Лучший отель!!!: " + bestHotel);
    }
}