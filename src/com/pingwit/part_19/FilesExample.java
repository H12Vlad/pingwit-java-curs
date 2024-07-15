package com.pingwit.part_19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class FilesExample {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/com/pingwit/part_19/FilesExample.java");
        Path target = Path.of("src/com/pingwit/part_19/ FilesExampleCopy.txt");

        System.out.println(path.getFileSystem());
        System.out.println(path.getFileName());

        String text = null;
        try {
            text = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(text);

        Path helloWorld = Files.writeString(target, "Hello World V2");

    }
}