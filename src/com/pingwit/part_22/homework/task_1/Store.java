package com.pingwit.part_22.homework.task_1;

import java.util.Objects;

public class Store {
    private String name;
    private Long id;

    public Store(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Store{id=" + id + ", name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(name, store.name) && Objects.equals(id, store.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}