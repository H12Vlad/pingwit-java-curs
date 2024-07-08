package com.pingwit.part_18.point_4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            String message = "Nice day";
            bos.write(message.getBytes());

            byte[] byteArray = bos.toByteArray();
            System.out.println(Arrays.toString(byteArray));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}