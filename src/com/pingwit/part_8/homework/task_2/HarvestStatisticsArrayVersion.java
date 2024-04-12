package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class HarvestStatisticsArrayVersion {
    public HarvestStatistic[] calculateStatistics(Harvest[] harvests) {
       HarvestStatistic[] statistics = new HarvestStatistic[harvests.length];
        for (int i = 0; i < harvests.length; i++) {
            Harvest currentHarvest =  harvests[i];

            //boolean updateResult = false;

            for (int j = 0; j < statistics.length; j++) {
                HarvestStatistic harvestStatistics =  statistics[j];

                if(harvestStatistics == null){
                    statistics[j] = new HarvestStatistic(currentHarvest.getPlant(), currentHarvest.getWeight());
                    break;
                }

                if(harvestStatistics != null && harvestStatistics.getPlant().equals(currentHarvest.getPlant())) {
                    BigDecimal totalWeight = harvestStatistics.getTotalWeight().add(currentHarvest.getWeight());
                    harvestStatistics.setTotalWeight(totalWeight);
                    //updateResult = true;
                    break;
                }
            }

//            if(!updateResult){
//                for (int j = 0; j < statistics.length; j++) {
//                    HarvestStatistic statistic = statistics[j];
//                    if(statistic == null) {
//                        statistics[j] = new HarvestStatistic(currentHarvest.getPlant(), currentHarvest.getWeight());
//                    }
//                }
//            }


        }
        return statistics;
    }
}
