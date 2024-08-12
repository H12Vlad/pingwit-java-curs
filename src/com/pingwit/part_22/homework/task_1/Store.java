package com.pingwit.part_22.homework.task_1;

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
}