package com.pingwit.part_9.homework.task_2;

public class ClientDataProcessor {
    public void processPerson(Person person) {
        if (person.getBirthYear() <= (2024 - 18) && person.getMaritalStatus().equalsIgnoreCase("single")) {
            if (person.getGender().equalsIgnoreCase("male")) {
                System.out.println("Уважаемый Савелий " + person.getName() + ", желаете ли познакомиться с девушкой?");
            } else if (person.getGender().equalsIgnoreCase("female")) {
                System.out.println("Уважаемая Виолетта " + person.getName() + ", мы поможем вам найти мужчину мечты!");
            } else {
                System.out.println("Невозможно определить пол клиента");
            }
        }else {
            // Выводим сообщение об ошибке, если данные не удовлетворяют условиям
            System.out.println("Данные клиента " + person.getName() + " " + person.getSurname() + " не соответствуют требованиям, просьба покинуть наш сайт!");
        }
    }
}
