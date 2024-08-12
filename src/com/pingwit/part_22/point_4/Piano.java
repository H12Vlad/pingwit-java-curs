package com.pingwit.part_22.point_4;
import java.util.Objects;
public class Piano {
    private String producer;
    private String color;
    private boolean electric;

    public Piano(String producer, String color, boolean electric) {
        this.producer = producer;
        this.color = color;
        this.electric = electric;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piano piano = (Piano) o;
        return Objects.equals(producer, piano.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer);
    }

    @Override
    public String toString() {
        return "Piano{" +
                "producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", electric=" + electric +
                '}';
    }
}
