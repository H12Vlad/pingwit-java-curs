package com.pingwit.part_18.point_3;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    private static final String FILE_PATH = "src/com/pingwit/part_18/point_3/output.txt";

    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH, true)) {
            fos.write(666);
            fos.write("\n\t".getBytes());
            fos.write("Hello from Java 17".getBytes());
            fos.write("Hello from Java 17".getBytes(), 1, 3);
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
