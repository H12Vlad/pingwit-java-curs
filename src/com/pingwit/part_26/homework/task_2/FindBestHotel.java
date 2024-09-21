package com.pingwit.part_26.homework.task_2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindBestHotel {
    public static void main(String[] args) throws Exception {
        List<Hotel> hotels = List.of(
                new Hotel("Diamond Hotel", 4.5),
                new Hotel("Seaside Resort", 4.7),
                new Hotel("Mountain Lodge", 4.9),
                new Hotel("City Inn", 4.2),
                new Hotel("Country House", 4.6)
        );

        Optional<Hotel> bestHotel = hotels.stream()
                .max(Comparator.comparing(Hotel::rating));

        System.out.println("!!!Лучший отель!!!: " + bestHotel);
    }
}