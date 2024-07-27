package com.pingwit.part_20.point_1;

public class SimpleWarehouseExample {
    public static void main(String[] args) {
        SomeData[] someData = {
                new SomeData("data_1"),
                new SomeData("data_2"),
                new SomeData("data_3")
        };
        SimpleWarehouse simpleWarehouse = new SimpleWarehouse(someData);

        for (int i = 0; i < 10; i++) {
            SomeData next = (SomeData) simpleWarehouse.next();
            System.out.println(next);
        }


        Car[] cars = new Car[10];
        SimpleWarehouse carWarehouse = new SimpleWarehouse(cars);

        Object[] someRandomData = {
                new SomeData("data_1"),
                new SomeData("data_2"),
                new Car("data_3")
        };

        SimpleWarehouse randomWarehouse = new SimpleWarehouse(someRandomData);

    }
}