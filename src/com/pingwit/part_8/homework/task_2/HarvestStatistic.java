package com.pingwit.part_8.homework.task_2;

import java.math.BigDecimal;

public class HarvestStatistic {
   private String plant;
   private BigDecimal totalWeight;
    public HarvestStatistic(String plant, BigDecimal totalWeight) {
        this.plant = plant;
        this.totalWeight = totalWeight;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }
}
