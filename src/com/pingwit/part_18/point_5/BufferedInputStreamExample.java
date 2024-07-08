package com.pingwit.part_18.point_5;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("src/com/pingwit/part_18/point_5/BufferedInputStreamExample.java");
             BufferedInputStream bis = new BufferedInputStream(fis)
        ) {
            byte[]bytes = new byte[1000];
            int n;

            while ((n = bis.read(bytes)) != -1){
                int available = bis.available();
                System.out.println(Arrays.toString(bytes));
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
