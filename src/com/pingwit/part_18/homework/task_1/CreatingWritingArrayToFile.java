package com.pingwit.part_18.homework.task_1;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingWritingArrayToFile {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        try (FileOutputStream fos = new FileOutputStream("src/com/pingwit/part_18/homework/task_1/writing_an_array_to_a_file.txt", true);
             BufferedOutputStream bos = new BufferedOutputStream(fos)
        ) {
            for (int number : numbers) {
                String numberStr = number + "\n";
                bos.write(numberStr.getBytes());
            }

            bos.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}