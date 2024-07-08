package com.pingwit.part_18.homework.task_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WorkingWithTaskTwo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/com/pingwit/part_18/homework/task_2/writing_text_to_file.txt");
             BufferedReader bf = new BufferedReader(fr)
        ) {
            String line;

            while ((line = bf.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}