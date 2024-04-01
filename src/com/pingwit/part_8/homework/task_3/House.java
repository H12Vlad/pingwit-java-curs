package com.pingwit.part_8.homework.task_3;

public class House {
    public static void main(String[] args) {
        // Создание объектов домов
        CityApartmentBuilding cityBuilding = new CityApartmentBuilding(10, false, 100);
        CountryHouse countryHouse = new CountryHouse(2, true, 4);

        // Создание каталога домов и добавление в него домов
        HouseCatalog catalog = new HouseCatalog(new House[0]);
        System.out.println(cityBuilding);
        System.out.println(countryHouse);
    }
}

