package com.pingwit.part_18.homework.task_4;

import java.io.*;

public class SecretWord {
    public static void main(String[] args) {
        File file = new File("src/com/pingwit/part_18/homework/task_4/Jenot.webp");
        byte[] fileContent = new byte[(int) file.length()];

        try (FileWriter fw = new FileWriter("src/com/pingwit/part_18/homework/task_4/Jenot.webp", true)) {
            fw.write("\n");
            fw.write("Code: phantom"); // вынеси секретную фразу в переменную

            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(fileContent); // вместо fis.read используй fis.skip() и передай длину файла ДО записи слова
            /*
            затем
            int secretMessageLength = текущий_размер_файла - размер файла до секретной фразы
            byte[] secretMessageBytes = fis.readNBytes(secretMessageLength)
            String secretMessage = new String(secretMessageBytes, StandardCharsets.UTF_8);
            System.out.println("Секретное сообщение: " + secretMessage);
             */
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        String fas = new String(fileContent);
        String secretMessage = fas.substring(fas.lastIndexOf("Code: phantom"));
        System.out.println("Секретное сообщение: " + secretMessage);
    }
}