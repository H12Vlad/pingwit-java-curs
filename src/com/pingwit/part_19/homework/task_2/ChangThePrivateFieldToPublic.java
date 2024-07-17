package com.pingwit.part_19.homework.task_2;

import com.pingwit.part_19.homework.task_1.Motorcycle;

import java.io.*;

public class ChangThePrivateFieldToPublic {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("motorcycle.ser"))) {
            Motorcycle deserializedMotorcycle = (Motorcycle) ois.readObject();
            System.out.println(deserializedMotorcycle);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}