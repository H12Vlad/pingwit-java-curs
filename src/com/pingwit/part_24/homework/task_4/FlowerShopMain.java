package com.pingwit.part_24.homework.task_4;

import java.util.Scanner;

public class FlowerShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop flowerShop = new FlowerShop();

        while (true) {
            flowerShop.processOrder(scanner);

            System.out.println("Для продолжения покупки нажмите Enter или введите 'exit' для завершения.");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                break;
            }
        }

        System.out.println("Спасибо за посещение нашего магазина!");
    }
}