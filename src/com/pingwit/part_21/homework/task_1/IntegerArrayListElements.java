package com.pingwit.part_21.homework.task_1;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerArrayListElements {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(0, i);
        }

        System.out.println("Список после добавления 100 элементов:");
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список после удаления всех четных элементов:");
        System.out.println(list);
    }
}