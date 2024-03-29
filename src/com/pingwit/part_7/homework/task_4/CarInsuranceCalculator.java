package com.pingwit.part_7.homework.task_4;

import java.util.Scanner;

public class CarInsuranceCalculator { // очень хорошее название класса
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        int engineVolume = scanner.nextInt();

        System.out.println("Были ДТП за прошлый год? (true/false):");
        boolean accidents = scanner.nextBoolean();

        System.out.println("Страховались у нас? (true/false):");
        boolean loyalCustomer = scanner.nextBoolean();

        double baseRate = engineVolume * 0.25; // вынеси 0.25 в отдельную переменную
        double coefficient = 1.0;

        if (accidents) {
            coefficient *= 1.2; // вынеси 1.2 в отдельную переменную
        }

        if (loyalCustomer) {
            coefficient *= 0.8;
        }

        double insuranceCost = baseRate * coefficient;
        System.out.println("Ваш полис стоит " + insuranceCost + " евро");
    }
}
