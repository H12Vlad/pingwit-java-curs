package com.pingwit.part_6.homework.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10;

        int[][] multiplicationTable = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("Таблица умножения:");
        System.out.print("  ");

        for (int i = 1; i <= size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n-------------------------------------------");

        for (int i = 0; i < size; i++) {
            System.out.printf("%2d|", i + 1);
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", multiplicationTable[i][j]);
            }
            System.out.println();
        }
    }
}
