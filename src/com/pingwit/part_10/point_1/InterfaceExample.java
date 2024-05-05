package com.pingwit.part_10.point_1;

public class InterfaceExample {
    public static void main(String[] args) {
        Car audi = new Audi();
        Car tesla = new Tesla();

        Car[] cars = new Car[10];
        cars[0] = audi;
        cars[1] = tesla;

        System.out.println(audi.getProducer());
        audi.openDoor();
        System.out.println(tesla.getProducer());
        tesla.openDoor();
    }
}
