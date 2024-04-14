package com.pingwit.part_9.homework.task_2;

public class ClientDataProcessor {
    public void processPerson(Person person) {
        // 2024 сделай полем класс или хотя бы переменной, не должно быть магический чисел
        // 18 сделай полем класс или хотя бы переменной, не должно быть магический чисел
        if (person.getBirthYear() <= (2024 - 18) && person.getMaritalStatus().equalsIgnoreCase("single")) {
            if (person.getGender().equalsIgnoreCase("male")) {
                System.out.println("Уважаемый Савелий " + person.getName() + ", желаете ли познакомиться с девушкой?"); // Савелий " + person.getName() - что-то здесь лишнее, имя Савелий было в качестве примера
            } else if (person.getGender().equalsIgnoreCase("female")) {
                System.out.println("Уважаемая Виолетта " + person.getName() + ", мы поможем вам найти мужчину мечты!"); // Виолетта " + person.getName() -  что-то здесь лишнее, имя Виолетта было в качестве примера
            } else {
                System.out.println("Невозможно определить пол клиента"); // этой опции не будет, после обновление в Person
            }
        } else {
            System.out.println("Данные клиента " + person.getName() + " " + person.getSurname() + " не соответствуют требованиям, просьба покинуть наш сайт!");
        }
    }
}