package com.pingwit.part_24.homework.task_4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
    private static final List<String> flowers = Arrays.asList("Ромашки", "Розы", "Тюльпаны");

    public void displayFlowers() {
        System.out.println("Добрый день, у нас самые свежие цветы, выберите номер позиции и нажмите Enter:");
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println((i + 1) + ". " + flowers.get(i));
        }
    }

    public boolean isEligibleForDiscount(Calendar currentDate) {
        return true;
    }

    public void processOrder(Scanner scanner) {
        String selectedFlower = null;
        while (selectedFlower == null) {
            try {
                displayFlowers();

                System.out.println("Ваш выбор: ");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice < 1 || choice > flowers.size()) {
                    System.out.println("Ошибка: Вы выбрали несуществующую позицию. Пожалуйста, выберите еще раз.");
                } else {
                    selectedFlower = flowers.get(choice - 1);
                    System.out.println("Вы выбрали: " + selectedFlower);
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный ввод. Пожалуйста, введите номер позиции.");
            }
        }

        Calendar currentDate = Calendar.getInstance();
        if (isEligibleForDiscount(currentDate)) {
            System.out.println("В честь праздника 8 Марта мы дарим вам скидку 10% на весь заказ.");
        } else {
            System.out.println("Сегодня нет специальных скидок.");
        }

        String address = null;
        while (address == null || address.trim().isEmpty()) {
            System.out.println("Введите пожалуйста адрес доставки: ");
            address = scanner.nextLine();

            if (address.trim().isEmpty()) {
                System.out.println("Ошибка: Адрес не может быть пустым. Пожалуйста, введите адрес.");
            }
        }
        System.out.println("Благодарим за ваш заказ, курьер свяжется с вами в ближайшее время.");
    }
}