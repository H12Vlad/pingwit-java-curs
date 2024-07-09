package com.pingwit.part_18.homework.task_2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingTextToFile {
    public static void main(String[] args) {

        try (FileOutputStream fos = new FileOutputStream("src/com/pingwit/part_18/homework/task_2/writing_text_to_file.txt", true);
             BufferedOutputStream bos = new BufferedOutputStream(fos)
        ) {
            String text = "Nice day today\n";

            for (int i = 0; i < 1000; i++) {
                bos.write(text.getBytes());
            }

            bos.flush();

        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}