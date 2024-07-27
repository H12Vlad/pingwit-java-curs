package com.pingwit.part_20.point_3;
import java.io.Serializable;
import java.math.BigDecimal;
public class PlantsStatistic {
    private String[] plants;
    private BigDecimal[] weights;
    private BigDecimal totalWeight = BigDecimal.ZERO;

    public <T extends Plant & Serializable> PlantsStatistic(T[] plants) {
        this.plants = new String[plants.length];
        this.weights = new BigDecimal[plants.length];

        for (int i = 0; i < plants.length; i++) {
            this.plants[i] = plants[i].getName();

            BigDecimal weight = plants[i].getWeight();
            this.weights[i] = weight;
            totalWeight = totalWeight.add(weight);
        }
    }

    public String[] getPlants() {
        return plants;
    }

    public void setPlants(String[] plants) {
        this.plants = plants;
    }

    public BigDecimal[] getWeights() {
        return weights;
    }

    public void setWeights(BigDecimal[] weights) {
        this.weights = weights;
    }

    public BigDecimal getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(BigDecimal totalWeight) {
        this.totalWeight = totalWeight;
    }
}