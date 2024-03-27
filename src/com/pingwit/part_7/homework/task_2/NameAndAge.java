package com.pingwit.part_7.homework.task_2;

public class NameAndAge { // -> Person, Student, Dog... Не используй названия вроде NameAndAge

    static String name; // это поле не должно быть static
    static int age;// это поле не должно быть static

    public NameAndAge(String name, int age) {
        System.out.println("Constructor: "); // а зачем пробел после ":" ?
        this.name = name;
        this.age = age;
    }

    public NameAndAge() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Блок инициализации
    {
        System.out.println("Создан новый экземпляр класса NameAndAge");
    }

}
