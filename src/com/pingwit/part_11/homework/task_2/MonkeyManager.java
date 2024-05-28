package com.pingwit.part_11.homework.task_2;

public class MonkeyManager {
    public void askMonkeyToCountFruits(Monkey monkey, Branch tree) {
        int fruits = monkey.countFruits(tree);

        System.out.println("Обезьяна посчитала:");
        System.out.println("Fruits: " + fruits);
    }
}