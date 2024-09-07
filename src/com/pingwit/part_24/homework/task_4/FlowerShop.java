package com.pingwit.part_24.homework.task_4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
    private static final List<String> FLOWERS = Arrays.asList("Ромашки", "Розы", "Тюльпаны");

    private void displayFlowers() {
        for (int i = 0; i < FLOWERS.size(); i++) {
            System.out.println((i + 1) + ". " + FLOWERS.get(i));
        }
    }

    public boolean isEligibleForDiscount(LocalDate currentDate) {
        if (currentDate.getMonthValue() == 3 && currentDate.getDayOfMonth() == 8) {
            return true;
        }

        LocalDate birthday = LocalDate.of(currentDate.getYear(), 5, 12); // такие данные следует передавать аргументом метода. Например, ты можешь спросить у пользователя когда у него ДР в методе processOrder()
        return currentDate.equals(birthday);
    }

    public void processOrder(Scanner scanner) {
        String selectedFlower = null;
        boolean isFirstAttempt = true;

        while (selectedFlower == null) {
            try {
                if (isFirstAttempt) {
                    System.out.println("Добрый день, у нас самые свежие цветы, выберите номер позиции и нажмите Enter:");
                    isFirstAttempt = false;
                } else {
                    System.out.println("Пожалуйста, выберите номер позиции еще раз и нажмите Enter:");
                }
                displayFlowers();

                System.out.println("Ваш выбор: ");
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice < 1 || choice > FLOWERS.size()) {
                    throw new IndexOutOfBoundsException("Ошибка: Вы выбрали несуществующую позицию. Пожалуйста, выберите еще раз.");
                } else {
                    selectedFlower = FLOWERS.get(choice - 1);
                    System.out.println("Вы выбрали: " + selectedFlower);
                }

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: некорректный ввод. Пожалуйста, введите номер позиции.");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        }

        LocalDate currentDate = LocalDate.now();
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