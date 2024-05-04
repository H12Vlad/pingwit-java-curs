package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;

public class ImmutableExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Warehouse citadel = new Warehouse(numbers);
        System.out.println(citadel);

        for (int i = 0; i < 16; i++) {
            int number = citadel.next();
            System.out.println("Next element: " + number);
        }
        System.out.println("Array: " + Arrays.toString(citadel.getArray()));
    }
}
