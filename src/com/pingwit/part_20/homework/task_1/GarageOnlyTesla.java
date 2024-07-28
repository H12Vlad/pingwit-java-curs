package com.pingwit.part_20.homework.task_1;

public class GarageOnlyTesla extends Car {// GarageOnlyTesla - исходя из названия, у тебя этот класс должен быть гаражом, а это просто автомобили марки Tesla, поэтому стоит переименовать класс в Tesla
    public GarageOnlyTesla(String model, String color) {
        super(model, color);
    }

    public GarageOnlyTesla(String model) { // этот конструктор нигде не используется, лучше его удалить и такой же у класса Car
        super(model);
    }
}