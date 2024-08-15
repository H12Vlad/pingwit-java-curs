package com.pingwit.part_22.homework.task_1;

import java.util.HashSet;
import java.util.Set;

public class StoreExample {
    public static void main(String[] args) {
        Set<Store> storeSet = new HashSet<>();

        Store store1 = new Store("Samsung", 1255733677L);
        Store store2 = new Store("Samsung", 1255733677L);
        Store store3 = new Store("Samsung", 1255733677L);

        storeSet.add(store1);
        storeSet.add(store2);
        storeSet.add(store3);

        for (Store store : storeSet) {
            System.out.println(store);
        }
    }
}