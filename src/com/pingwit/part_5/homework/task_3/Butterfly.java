package com.pingwit.part_5.homework.task_3;

import java.util.Scanner; // перед и после импорта должен быть абзац

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер бабочки (нечетное число): ");
        int size = scanner.nextInt();
        scanner.close();//это лишнее

        if (size % 2 == 0) {
            System.out.println("Размер должен быть нечетным!"); // если добавил такую проверку, то сделай это в цикле, чтобы программа заново попросила ввести число, а не завершила работу
            return;
        }

        drawButterfly(size);
    }

    /*
    - вместо * печатай цифры, так будет проще искать ошибку
    - пока еще подумай над решением

    Если размер 3, то должно вывести
        1   1
        12 21
        12321
        12 21
        1   1
    */
    public static void drawButterfly(int size) {
        int halfSize = size / 2;
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < i + 1; j++) { // объедени 3 цикла в 1
                System.out.print("1 ");
            }
            for (int j = 0; j < size - 2 * (i + 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("2 ");
            }
            System.out.println();
        } // добавь абзац
        for (int i = halfSize; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) { // объедени 3 цикла в 1
                System.out.print("3 ");
            }
            for (int j = 0; j < size - 2 * (i + 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("4 ");
            }
            System.out.println();
        }
    }
}
