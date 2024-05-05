package com.pingwit.part_10.point_1;

public interface Car {
    int MAX_SPEED = 355;
    void move();
    String getProducer();
    default void openDoor(){
        System.out.println("Door is opened");
    }

    static String showInterface(){
        return "I'm a car";
    }

}
