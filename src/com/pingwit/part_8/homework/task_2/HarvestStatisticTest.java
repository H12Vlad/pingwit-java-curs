package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;

public class HarvestStatisticTest {
    public static void main(String[] args) {
        // Создаем несколько объектов Harvest
        Harvest[] harvests = {
                new Harvest(1L, "Поле 1", "Пшеница", new BigDecimal("100")),
                new Harvest(2L, "Поле 2", "Пшеница", new BigDecimal("150")),
                new Harvest(3L, "Поле 1", "Рожь", new BigDecimal("200")),
                new Harvest(4L, "Поле 3", "Клубника", new BigDecimal("50")),
                new Harvest(5L, "Поле 2", "Картофель", new BigDecimal("300"))
        };

        // Создаем объект HarvestStatisticService
        HarvestStatisticService service = new HarvestStatisticService();

        // Вычисляем статистику по урожаю
        HarvestStatistic[] statistics = service.calculateStatistics(harvests);

        // Выводим статистику
        for (HarvestStatistic statistic : statistics) {
            System.out.println("Растение: " + statistic.getPlant() + ", Общий вес урожая: " + statistic.getTotalWeight());
        }
    }
}