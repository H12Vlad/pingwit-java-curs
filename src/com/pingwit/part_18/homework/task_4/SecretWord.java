package com.pingwit.part_18.homework.task_4;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class SecretWord {
    public static void main(String[] args) {
        String secretMessage = "Code: phantom";
        File file = new File("src/com/pingwit/part_18/homework/task_4/Jenot.webp");

        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            long fileLengthBeforeWrite = raf.length();
            raf.seek(fileLengthBeforeWrite);
            raf.write(("\n" + secretMessage).getBytes(StandardCharsets.UTF_8));

            long secretMessageLength = raf.length() - fileLengthBeforeWrite;

            raf.seek(fileLengthBeforeWrite);
            byte[] secretMessageBytes = new byte[(int) secretMessageLength];
            raf.readFully(secretMessageBytes);

            String readSecretMessage = new String(secretMessageBytes, StandardCharsets.UTF_8);
            System.out.println("Секретное сообщение: " + readSecretMessage);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}