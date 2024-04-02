package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

// А ты проверял решение задачи? Я не нашел класса с методом main(), код выглядит ок, но необходимо запустить и проверить
public class HarvestStatisticService {
    public HarvestStatistic[] calculateStatistics(Harvest[] harvests) {
        Map<String, BigDecimal> plantWeights = new HashMap<>();

        for (Harvest harvest : harvests) {
            String plant = harvest.getPlant();
            BigDecimal weight = harvest.getWeight();
            if (plantWeights.containsKey(plant)) {
                BigDecimal currentWeight = plantWeights.get(plant);
                plantWeights.put(plant, currentWeight.add(weight));
            } else {
                plantWeights.put(plant, weight);
            }
        }
        HarvestStatistic[] statistics = new HarvestStatistic[plantWeights.size()];
        int index = 0;
        for (Map.Entry<String, BigDecimal> entry : plantWeights.entrySet()) {
            statistics[index] = new HarvestStatistic(entry.getKey(), entry.getValue());
            index++;
        }
        return statistics;
    }
}
