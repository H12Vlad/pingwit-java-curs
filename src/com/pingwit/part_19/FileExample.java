package com.pingwit.part_19;

import java.io.IOException;

import java.io.File;
public class FileExample {
    public static void main(String[] args) throws IOException {
        File file = new File("src/com/pingwit/part_19/my_file.txt");

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        file.createNewFile();
        file.delete();
        file.delete();

        System.out.println("file.exists()=" + file.exists());

    }
}
