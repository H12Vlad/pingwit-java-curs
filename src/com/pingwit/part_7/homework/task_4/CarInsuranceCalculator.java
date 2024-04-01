package com.pingwit.part_7.homework.task_4;

import java.util.Scanner;

public class CarInsuranceCalculator {
    public static void main(String[] args) {
        double priceVolume = 0.25;
        double allowance = 1.2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите объем двигателя в см3:");
        int engineVolume = scanner.nextInt();

        System.out.println("Были ДТП за прошлый год? (true/false):");
        boolean accidents = scanner.nextBoolean();

        System.out.println("Страховались у нас? (true/false):");
        boolean loyalCustomer = scanner.nextBoolean();

        double baseRate = engineVolume * priceVolume;
        double coefficient = 1.0;

        if (accidents) {
            coefficient *= allowance;
        }

        if (loyalCustomer) {
            coefficient *= 0.8;
        }

        double insuranceCost = baseRate * coefficient;
        System.out.println("Ваш полис стоит " + insuranceCost + " евро");
    }
}
