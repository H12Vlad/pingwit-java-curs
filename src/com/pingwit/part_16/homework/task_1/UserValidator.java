package com.pingwit.part_16.homework.task_1;

public class UserValidator {
    public boolean validate(User user) {
        if (user.getUsername() == null || user.getUsername().isEmpty()) { // || -> &&, если оставить || и user.getUsername() будет null, то user.getUsername().isEmpty() спровоцирует NullPointerException
            System.out.println(String.format("Username не может быть пустым.")); // Здесь не нужен String.format()
            return false;
        } // у тебя здесь нету абзаца, а дальше везде есть. Давай сюда тоже добавим
        if (!user.getFirstName().matches("[a-zA-Zа-яА-Я]+")) { // [a-zA-Zа-яА-Я]+" - в константу
            System.out.println(String.format("Имя может содержать только буквы, вы ввели невалидное имя: %s", user.getFirstName()));
            return false;
        }

        if (!user.getLastName().matches("[a-zA-Zа-яА-Я]+")) { // [a-zA-Zа-яА-Я]+" - в константу
            System.out.println(String.format("Фамилия может содержать только буквы, вы ввели невалидную фамилию: %s", user.getLastName()));
            return false;
// лишняя строка, удали
        }
        // старайся все regex выносить в константы с названием, которое примерно отобразить суть проверки, текст сообщений об ошибках НЕ нужно выносить в константы
        if (!user.getEmail().matches("^[\\w._%+-]+@[\\w.-]+\\.(com|pl|eu)$")) { // можно упросить до ".+@.+\\.(com|pl|eu)" = любые_символы@любые_символы.com|pl|eu
            System.out.println(String.format("Email должен содержать @ и иметь допустимый домен (.com, .pl, .eu), вы ввели невалидный email: %s", user.getEmail()));
            return false;
        }
        // старайся все regex выносить в константы с названием, которое примерно отобразить суть проверки
        if (!user.getPhone().matches("\\d+")) {
            System.out.println(String.format("Телефон может содержать только цифры, вы ввели невалидный телефон: %s", user.getPhone()));
            return false;
        }

        if (user.getPassword() == null || user.getPassword().isEmpty()) { // || -> &&, если оставить || и user.getPassword() будет null, то user.getPassword().isEmpty() спровоцирует NullPointerException
            System.out.println(String.format("Пароль не может быть пустым."));// Здесь не нужен String.format()
            return false;
        }
        return true;
    }
}