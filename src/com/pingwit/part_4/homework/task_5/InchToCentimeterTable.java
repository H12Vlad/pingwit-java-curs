package com.pingwit.part_4.homework.task_5;

public class InchToCentimeterTable {
    public static void main(String[] args) {
        System.out.println("Дюймы   |   Сантиметры");
        System.out.println("-----------------------");
        final double INCH_TO_CM = 2.54; // название переменных с маленькой буквы, не вижу смысла здесь использовать final
        for (int x = 1; x <= 20; x++) {
            double centimeters = x * INCH_TO_CM; 
            System.out.printf("%-7d |   %.2f\n", x, centimeters);
        }
    }
}
