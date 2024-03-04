package com.pingwit.part_4.homework.task_9;

public class DiamondShape {
    public static void main(String[] args) {
        int size = 5; // опционально можно добавить абзац
        for (int i = 1; i <= size; i++) {
            for (int j = size - i; j > 0; j--) { // этот цикл и следующий давай объеденим в один
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = size - i; j > 0; j--) { // этот цикл и следующий давай объеденим в один
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
