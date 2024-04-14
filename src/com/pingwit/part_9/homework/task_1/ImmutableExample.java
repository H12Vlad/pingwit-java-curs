package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;

public class ImmutableExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Warehouse citadel = new Warehouse(numbers);
        System.out.println(citadel);
        // первый вызов метода next() возвращает двойку, а должен единицу. Подумай как это можно сделать не меняя метод next()
        System.out.println("Next element: " + citadel.next()); // давай заменим 3 одинаковые строки циклом
        System.out.println("Next element: " + citadel.next());
        System.out.println("Next element: " + citadel.next());
        System.out.println("Array: " + Arrays.toString(citadel.getArray()));
    }
}
