package com.pingwit.part_22.point_2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MutableHashMapKeyExample {
    public static void main(String[] args) {
        Map<Tractor, Integer> tractors = new HashMap<>();

        Tractor hazard = new Tractor(1, "Hazard");
        tractors.put(hazard, 777);

        System.out.println(hazard);
        System.out.println(tractors.get(hazard));

        hazard.setProducer("Hazart");
        System.out.println(tractors.get(hazard));
        System.out.println(tractors);

        Collection<Integer> values = tractors.values();
        System.out.println(values);

        for (Map.Entry<Tractor, Integer> tractor : tractors.entrySet()) {
            System.out.println(tractor.getKey() + ":" + tractor.getValue());
        }
    }
}

class Tractor {
    private int id;
    private String producer;

    public Tractor(int id, String producer) {
        this.id = id;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tractor tractor = (Tractor) o;
        return id == tractor.id && Objects.equals(producer, tractor.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, producer);
    }

    @Override
    public String toString() {
        return "Tractor{" +
                "id=" + id +
                ", producer='" + producer + '\'' +
                '}';
    }
}
