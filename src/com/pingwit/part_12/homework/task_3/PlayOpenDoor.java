package com.pingwit.part_12.homework.task_3;

import java.lang.reflect.Method;

public class PlayOpenDoor {
    public static void main(String[] args) {
        Flat myFlat = new Flat();

        try {
            Method openDoorMethod = Flat.class.getDeclaredMethod("openDoor");
            openDoorMethod.setAccessible(true);
            openDoorMethod.invoke(myFlat);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}