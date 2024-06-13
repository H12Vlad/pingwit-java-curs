package com.pingwit.part_14.homework.task_6;

import java.util.Arrays;

public class EngineReplacement {
    public static void main(String[] args) {
        String[] engines = {
                "1.4", "1.8", "2.0", "1.4", "1.8",
                "2.5", "3.0", "1.4", "1.8", "2.0"
        };
        System.out.println("Исходные маркировки: " + Arrays.toString(engines));// можно было не сортировать, но если очень хотелось, то ок

        for (int i = 0; i < engines.length; i++) {
            if (engines[i].equals("1.4")) {
                engines[i] = "2.0T";
            } else if (engines[i].equals("1.8")) {
                engines[i] = "1.8T";
            }
        }
        System.out.println("Измененные маркировки: " + Arrays.toString(engines));
    }
}