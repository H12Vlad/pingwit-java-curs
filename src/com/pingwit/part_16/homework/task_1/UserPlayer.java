package com.pingwit.part_16.homework.task_1;

import java.util.Scanner;

public class UserPlayer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите Username: ");
        String username = scanner.nextLine();

        System.out.print("Введите Имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите Фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите Email: ");
        String email = scanner.nextLine();

        System.out.print("Введите Телефон: ");
        String phone = scanner.nextLine();

        System.out.print("Введите Пароль: ");
        String password = scanner.nextLine();

        User user = new User(username, firstName, lastName, email, phone, password);
        UserValidator validator = new UserValidator();

        boolean isValid = validator.validate(user);

        if (isValid) {
            System.out.println("Все данные валидны. Учетная запись успешно создана.");
        }
    }
}