package com.pingwit.part_24.homework.task_4;

import java.util.Scanner;

public class FlowerShopMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlowerShop flowerShop = new FlowerShop();

        flowerShop.processOrder(scanner);

        System.exit(0);
        System.out.println("Спасибо за посещение нашего магазина!");
    }
}