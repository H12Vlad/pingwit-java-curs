package com.pingwit.part_20.point_1;

public class SimpleWarehouse {
    Object[] data;

    int pointer;

    public SimpleWarehouse(Object[] data) {
        this.data = data;
    }

    public Object next() {
        if (pointer == data.length) {
            pointer = 0;
        }

        Object someData = data[pointer];
        pointer++;

        return someData;
    }
}

record SomeData(String name) {
}

record Car(String name) {
}