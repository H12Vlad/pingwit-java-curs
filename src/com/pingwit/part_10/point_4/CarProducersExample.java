package com.pingwit.part_10.point_4;

public class CarProducersExample {
    public static void main(String[] args) {
        System.out.println(CarProducers.MAZDA.sound());
        System.out.println(CarProducers.BMW.sound());
        System.out.println(CarProducers.FIAT.sound());
        System.out.println(CarProducers.TESLA.sound());

        System.out.println("--------------");

        CarProducers.MAZDA.sayHi();
        CarProducers.BMW.sayHi();
        CarProducers.FIAT.sayHi();
        CarProducers.TESLA.sayHi();
    }
}
