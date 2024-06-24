package com.pingwit.part_16.homework.task_1;

public class UserValidator {
    public boolean validate(User user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            System.out.println(String.format("Username не может быть пустым."));
            return false;
        }
        if (!user.getFirstName().matches("[a-zA-Zа-яА-Я]+")) {
            System.out.println(String.format("Имя может содержать только буквы, вы ввели невалидное имя: %s", user.getFirstName()));
            return false;
        }

        if (!user.getLastName().matches("[a-zA-Zа-яА-Я]+")) {
            System.out.println(String.format("Фамилия может содержать только буквы, вы ввели невалидную фамилию: %s", user.getLastName()));
            return false;

        }
        if (!user.getEmail().matches("^[\\w._%+-]+@[\\w.-]+\\.(com|pl|eu)$")) {
            System.out.println(String.format("Email должен содержать @ и иметь допустимый домен (.com, .pl, .eu), вы ввели невалидный email: %s", user.getEmail()));
            return false;
        }

        if (!user.getPhone().matches("\\d+")) {
            System.out.println(String.format("Телефон может содержать только цифры, вы ввели невалидный телефон: %s", user.getPhone()));
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println(String.format("Пароль не может быть пустым."));
            return false;
        }
        return true;
    }
}