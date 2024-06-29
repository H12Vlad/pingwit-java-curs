package com.pingwit.part_16.homework.task_1;

public class UserValidator {
    public boolean validate(User user) {
        String inputLetters = "[a-zA-Zа-яА-Я]+";
        String inputEmail = "^[\\w._%+-]+@[\\w.-]+\\.(com|pl|eu)$";
        String inputPhone = "\\d+";

        if (user.getUsername() == null || user.getUsername().isEmpty()) {
            System.out.println("Username не может быть пустым.");
            return false;
        }

        if (!user.getFirstName().matches(inputLetters)) {
            System.out.println(String.format("Имя может содержать только буквы, вы ввели невалидное имя: %s", user.getFirstName()));
            return false;
        }

        if (!user.getLastName().matches(inputLetters)) {
            System.out.println(String.format("Фамилия может содержать только буквы, вы ввели невалидную фамилию: %s", user.getLastName()));
            return false;
        }

        if (!user.getEmail().matches(inputEmail)) {
            System.out.println(String.format("Email должен содержать @ и иметь допустимый домен (.com, .pl, .eu), вы ввели невалидный email: %s", user.getEmail()));
            return false;
        }

        if (!user.getPhone().matches(inputPhone)) {
            System.out.println(String.format("Телефон может содержать только цифры, вы ввели невалидный телефон: %s", user.getPhone()));
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println("Пароль не может быть пустым.");
            return false;
        }
        return true;
    }
}