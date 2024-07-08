package com.pingwit.part_18.point_2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("src/com/pingwit/part_18/point_2/FileInputStreamExample.java")){
            int data;
            while ((data = fis.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
