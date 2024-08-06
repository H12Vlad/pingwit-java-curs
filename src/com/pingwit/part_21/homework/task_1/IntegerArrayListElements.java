package com.pingwit.part_21.homework.task_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerArrayListElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            numbers.add(0, i);
        }

        System.out.println("Список после добавления 100 элементов:");
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Список после удаления всех четных элементов:");
        System.out.println(numbers);
    }
}