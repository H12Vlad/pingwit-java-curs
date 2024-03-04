package com.pingwit.part_4.homework.task_5;

public class InchToCentimeterTable {
    public static void main(String[] args) {
        System.out.println("Дюймы   |   Сантиметры");
        System.out.println("-----------------------");
        double inch_to_cm = 2.54;
        for (int x = 1; x <= 20; x++) {
            double centimeters = x * inch_to_cm;
            System.out.printf("%-7d |   %.2f\n", x, centimeters);
        }
    }
}
