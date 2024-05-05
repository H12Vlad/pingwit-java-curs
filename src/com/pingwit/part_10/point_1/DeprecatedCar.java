package com.pingwit.part_10.point_1;

public interface DeprecatedCar {
    default void openDoor(){
        System.out.println("Door is opened");
    }

}
