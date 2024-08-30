package com.pingwit.part_24.homework.task_4;

import java.util.Scanner;

public class FlowerShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop flowerShop = new FlowerShop();

        /* processOrder - метод у тебя обозначен как статический метод, чтобы его вызвать не нужно создавать экземпляр класса,
         можно просто FlowerShop.processOrder(), но такой вариант лучше не использовать.
         Поэтому лучше убрать static из всех методов класса FlowerShop
         */
        flowerShop.processOrder(scanner);

        System.exit(0);
        System.out.println("Спасибо за посещение нашего магазина!"); // этот код никогда не выполнится, потому что System.exit(0); завершит программу
    }
}