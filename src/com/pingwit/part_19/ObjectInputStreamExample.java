package com.pingwit.part_19;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/com/pingwit/part_19/person");
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Person person = (Person) ois.readObject();
            System.out.println(person);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}