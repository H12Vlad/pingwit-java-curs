package com.pingwit.part_20.point_3;
import java.math.BigDecimal;
import java.util.Arrays;

public class PlantsStatisticExample {
    public static void main(String[] args) {
        Oat[] plants = {
                new Oat("IndianOat", new BigDecimal("100")),
                new Oat("UsaOat", new BigDecimal("100")),
//                new Rice("VietnamRice", new BigDecimal("50"))
        };

        PlantsStatistic plantsStatistic = new PlantsStatistic(plants);

        System.out.println(Arrays.toString(plantsStatistic.getPlants()));
        System.out.println(Arrays.toString(plantsStatistic.getWeights()));
        System.out.println(plantsStatistic.getTotalWeight());
    }
}