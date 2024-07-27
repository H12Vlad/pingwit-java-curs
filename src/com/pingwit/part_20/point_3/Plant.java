package com.pingwit.part_20.point_3;

import java.io.Serializable;
import java.math.BigDecimal;

public interface Plant {
    String getName();

    BigDecimal getWeight();
}

class Oat implements Plant, Serializable {
    private String name;
    private BigDecimal weight;

    public Oat(String name, BigDecimal weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}

class Rice implements Plant {
    private String name;
    private BigDecimal weight;

    public Rice(String name, BigDecimal weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}