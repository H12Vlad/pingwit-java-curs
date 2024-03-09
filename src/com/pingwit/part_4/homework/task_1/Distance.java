package com.pingwit.part_4.homework.task_1;

public class Distance {
    public static void main(String[] args) {
        double firstDayDistance = 10;
        double totalDistance = 0;
        for (int day = 1; day <= 7; day++) {
            totalDistance += firstDayDistance;
            firstDayDistance *= 1.1;
        }
        System.out.println("Суммарный путь спортсмена за 7 дней: " + totalDistance + " км");
    }
}

