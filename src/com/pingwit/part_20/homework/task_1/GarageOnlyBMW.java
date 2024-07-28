package com.pingwit.part_20.homework.task_1;

public class GarageOnlyBMW extends Car { // GarageOnlyBMW - исходя из названия, у тебя этот класс должен быть гаражом, а это просто автомобили марки BMW, поэтому стоит переименовать класс в Bmw
    public GarageOnlyBMW(String model, String color) {
        super(model, color);
    }

    public GarageOnlyBMW(String model) {
        super(model);
    } // этот конструктор нигде не используется, лучше его удалить и такой же у класса Car
}