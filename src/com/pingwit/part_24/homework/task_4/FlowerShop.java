package com.pingwit.part_24.homework.task_4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
    private static final List<String> FLOWERS = Arrays.asList("Ромашки", "Розы", "Тюльпаны");

    private void displayFlowers() {
        for (int i = 0; i < FLOWERS.size(); i++) {
            System.out.println((i + 1) + ". " + FLOWERS.get(i));
        }
    }

    public boolean isEligibleForDiscount(Calendar currentDate) {
        int month = currentDate.get(Calendar.MONTH);
        int day = currentDate.get(Calendar.DAY_OF_MONTH);

        if (month == Calendar.MARCH && day == 8) {
            return true;
        }

        Calendar birthday = Calendar.getInstance();
        birthday.set(Calendar.MONTH, Calendar.MAY);
        birthday.set(Calendar.DAY_OF_MONTH, 12);

        if (month == birthday.get(Calendar.MONTH) && day == birthday.get(Calendar.DAY_OF_MONTH)) {
            return true;
        }
        return false;
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

        Calendar currentDate = Calendar.getInstance(); // лучше использовать LocalDate.now() , календарь это довольно старый инструмент. Работу с датами мы проходили на 17ом занятии
        if (isEligibleForDiscount(currentDate)) {
            System.out.println("В честь праздника 8 Марта мы дарим вам скидку 10% на весь заказ.");
        } else {
            System.out.println("Сегодня нет специальных скидок.");
        }

        String address = null;
        /*
        часть "|| address.trim().isEmpty()" в начале цикла у тебя адрес всегда равен null,
        а в 78 строке, если адрес пустой, то выбрасывается исключение, получается в этой проверке нету смысла + цикл всегда отрабатывает только 1 раз.
        Можно убрать цикл, либо не выбрасывать исключение и переспросить адрес
         */
        while (address == null || address.trim().isEmpty()) {
            System.out.println("Введите пожалуйста адрес доставки: ");
            address = scanner.nextLine();

            if (address.trim().isEmpty()) {
                throw new IllegalArgumentException("Ошибка: Адрес не может быть пустым. Пожалуйста, введите адрес.");
            }
        }
        System.out.println("Благодарим за ваш заказ, курьер свяжется с вами в ближайшее время.");
    }
}