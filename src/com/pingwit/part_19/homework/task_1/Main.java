package com.pingwit.part_19.homework.task_1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(1000, "ABC123");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", engine);

        serializeToFile(motorcycle, "motorcycle.ser");

        Motorcycle deserializedMotorcycle = deserializeFromFile("motorcycle.ser");

        System.out.println("Deserialized Motorcycle:");
        System.out.println(deserializedMotorcycle);
    }

    private static void serializeToFile(Motorcycle motorcycle, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(motorcycle);
            System.out.println("Motorcycle serialized successfully. File saved as: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Motorcycle deserializeFromFile(String fileName) {
        Motorcycle motorcycle = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            motorcycle = (Motorcycle) ois.readObject();
            System.out.println("Motorcycle deserialized successfully from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return motorcycle;
    }
}