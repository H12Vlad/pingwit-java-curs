package com.pingwit.part_10.point_1;

public class Tesla implements Car, ElectricEngine{
    private static String PRODUCER = "Tesla";
    @Override
    public void move() {
        System.out.println("Tesla is moving");
    }

    @Override
    public String getProducer() {
        return PRODUCER;
    }

    @Override
    public void openDoor() {
        System.out.println("Tesla's door is opened");    }
}
