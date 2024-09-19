package com.pingwit.part_26.point_1;

import com.pingwit.part_25.point_3.entity.Phone;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingExample {
    public static void main(String[] args) {
        List<Phone> phones = List.of(
                new Phone("Xs", "Apple", 200),
                new Phone("8", "Apple", 400),
                new Phone("S10", "Samsung", 250),
                new Phone("S10", "Samsung", 350),
                new Phone("3310", "Nokia", 1000),
                new Phone("8800", "Nokia", 1000)
        );

        IntSummaryStatistics priceStatistics = phones.stream()
                .map(Phone::price)
                .collect(Collectors.summarizingInt(Integer::valueOf));

        System.out.println("priceStatistics.getMax() " + priceStatistics.getMax());
        System.out.println("priceStatistics.getMin() " + priceStatistics.getMin());
        System.out.println("priceStatistics.getAverage() " + priceStatistics.getAverage());
        System.out.println("priceStatistics.getCount() " + priceStatistics.getCount());
        System.out.println("priceStatistics.getSum() " + priceStatistics.getSum());

        IntSummaryStatistics intSummaryStatistics = phones.stream()
                .mapToInt(Phone::price)
                .summaryStatistics();
    }
}
