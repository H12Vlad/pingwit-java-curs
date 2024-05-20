package com.pingwit.part_11.homework.task_2;

public class MonkeyManager {
    public void askMonkeyToCountFruits(Monkey monkey, Branch tree) {
        int bananas = monkey.countBananas(tree); // сделай обезьяне 1 метод countFruits() и переопредели его у каждой из обезьян, не обязательно разделять на бананы и кокосы
        int coconuts = monkey.countCoconuts(tree);

        System.out.println("Обезьяна посчитала:");
        System.out.println("Бананы: " + bananas);
        System.out.println("Кокосы: " + coconuts);
    }
}