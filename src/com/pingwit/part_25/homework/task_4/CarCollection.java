package com.pingwit.part_25.homework.task_4;

import com.pingwit.part_25.point_3.entity.Phone;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarCollection {

    public static void main(String[] args) {
        List<Car> cars = List.of(
                new Car("Passat B8", "VW",2016),
                new Car("GLE 200", "Mercedes-Benz",2019),
                new Car("Golf 7", "VW",2016),
                new Car("A6C8", "Audi",2016),
                new Car("Megan II", "Renault",2016),
                new Car("5008", "Peugeot",2016)
        );

        Map<String, List<Car>> carsByManufacturer = cars.stream()
                .collect(Collectors.groupingBy(Car::manufacturer));
//Саша,какой вывод на Экран будет правильным ?
        carsByManufacturer.forEach((manufacturer, carList) ->
                System.out.println(manufacturer) // здесь ты выводишь производителя, а в след строке добавь вывод на экран переменной carList
                // если нажмешь control и наведешь мышку на переменную carList, то увидишь что это коллекция автомобилей
        );
        System.out.println(carsByManufacturer); // этот вывод можно убрать, он не очень красивый для восприятия
    }
}