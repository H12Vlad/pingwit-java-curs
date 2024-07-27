package com.pingwit.part_20.point_4;

public class Database<T> {
    private T[] data;

    public Database(T[] data) {
        this.data = data;
    }

    public <E extends T> void addAll(Database<E> newDatabase) {
        T[] newElements = newDatabase.getData();

        T[] tmp = (T[]) new Object[data.length + newElements.length];

        int pointer = 0;

        for (int i = 0; i < data.length; i++) {
            tmp[pointer] = data[i];
        }

        for (int i = 0; i < newElements.length; i++) {
            tmp[pointer] = newElements[i];
        }

        data = tmp;
    }

    public T[] getData() {
        return data;
    }
}


interface Worker {

}

class Developer implements Worker {

}

class QA implements Worker {

}