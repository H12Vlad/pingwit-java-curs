package com.pingwit.part_18.point_7;
import java.io.FileInputStream;
import java.io.IOException;
public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/com/pingwit/part_18/point_7/eminem_lose_yourself.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
