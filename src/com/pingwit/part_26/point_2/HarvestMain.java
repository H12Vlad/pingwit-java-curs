package com.pingwit.part_26.point_2;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class HarvestMain {
    public static void main(String[] args) {
        List<Harvest> harvests = List.of(
                new Harvest(110L, "Field 1", "Wheat", BigDecimal.valueOf(120.25)),
                new Harvest(120L, "Field 2", "Wheat", BigDecimal.valueOf(319.25)),
                new Harvest(130L, "Field 1", "Linen", BigDecimal.valueOf(350.00)),
                new Harvest(140L, "Field 2", "Potato", BigDecimal.valueOf(520.86)),
                new Harvest(150L, "Field 2", "Cucumber", BigDecimal.valueOf(200.36)),
                new Harvest(160L, "Field 3", "Cucumber", BigDecimal.valueOf(55.55)),
                new Harvest(170L, "Field 3", "Onion", BigDecimal.valueOf(332.45))
        );


        HarvestStatisticService harvestStatisticService = new HarvestStatisticService();
        HarvestStatistic[] harvestStatisticsOld = harvestStatisticService.calculateStatistic(harvests.toArray(new Harvest[]{}));
        for (HarvestStatistic harvestStatistic : harvestStatisticsOld) {
            if (harvestStatistic != null) {
                System.out.println(harvestStatistic.getPlant() + ":" + harvestStatistic.getTotalWeight());
            }
        }

        System.out.println("===New version===");

        Map<String, BigDecimal> harvestStatistics = harvests.stream()
                .collect(Collectors.toMap(Harvest::plant, Harvest::weight, BigDecimal::add, TreeMap::new));

        harvestStatistics.forEach((k, v) -> System.out.println(k + ":" + v));

    }
}
