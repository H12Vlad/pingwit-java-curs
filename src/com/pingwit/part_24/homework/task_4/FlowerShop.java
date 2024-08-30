package com.pingwit.part_24.homework.task_4;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FlowerShop {
    private static final List<String> flowers = Arrays.asList("Ромашки", "Розы", "Тюльпаны");

    public static void displayFlowers() {
        System.out.println("Добрый день, у нас самые свежие цветы, выберите номер позиции и нажмите Enter:");
        for (int i = 0; i < flowers.size(); i++) {
            System.out.println((i + 1) + ". " + flowers.get(i));
        }
    }

    public static boolean isEligibleForDiscount(Calendar currentDate) {
        return true;
    }

    /*
    если я ввожу неверный id цветов, то программа завершает работу. Давай сделаем так, чтобы при вводе неверного id цветка программа не завершала работу, а просила еще раз ввести верный
     */
    public static void processOrder(Scanner scanner) {
        try {
            displayFlowers();

            System.out.println("Ваш выбор: ");
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice < 1 || choice > flowers.size()) {
                throw new IndexOutOfBoundsException("Вы выбрали несуществующую позицию.");
            }

            String selectedFlower = flowers.get(choice - 1);
            System.out.println("Вы выбрали: " + selectedFlower);

            Calendar currentDate = Calendar.getInstance();
            if (isEligibleForDiscount(currentDate)) {
                System.out.println("В честь праздника 8 Марта мы дарим вам скидку 10% на весь заказ.");
            } else {
                System.out.println("Сегодня нет специальных скидок.");
            }

            System.out.println("Введите пожалуйста адрес доставки: ");
            String address = scanner.nextLine();

            if (address.trim().isEmpty()) {
                throw new IllegalArgumentException("Адрес не может быть пустым."); // обрати внимание, что это сообщение пользователь не видит, поскольку в блоке catch ты выводишь на экран другое
            }

            System.out.println("Благодарим за ваш заказ, курьер свяжется с вами в ближайшее время.");

        } catch (Exception e) {
            System.out.println("Ошибка: некорректный ввод. Пожалуйста, введите номер позиции."); // чтобы отобразить реальное сообщение об ошибке необходимо у переменной "e" e.getMessage()
        }
    }
}