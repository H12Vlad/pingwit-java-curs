package com.pingwit.part_8.task_3;

public class HouseCatalog {
        private House[] houses;

        public HouseCatalog(House[] houses) {
            this.houses = houses;
        }

        public void addHouse(House house) {
            // Добавить проверки на размер массива и другие условия при необходимости
            House[] newHouses = new House[houses.length + 1];
            System.arraycopy(houses, 0, newHouses, 0, houses.length);
            newHouses[houses.length] = house;
            houses = newHouses;
        }

        // Другие методы для работы с каталогом, например, поиск по параметрам и т.д.
    }
