package com.pingwit.part_8.homework.task_3;

public class HouseCatalog {
    private House[] houses;

    public HouseCatalog(House[] houses) {
        this.houses = houses;
    }

    public void addHouse(House house) {
        House[] newHouses = new House[houses.length + 1];
        System.arraycopy(houses, 0, newHouses, 0, houses.length);
        newHouses[houses.length] = house;
        houses = newHouses;
    }
}