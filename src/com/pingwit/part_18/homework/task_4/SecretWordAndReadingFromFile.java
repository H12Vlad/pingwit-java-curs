package com.pingwit.part_18.homework.task_4;

import java.io.*;

public class SecretWordAndReadingFromFile {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("src/com/pingwit/part_18/homework/task_4/Jenot.webp", true);
            BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){
            String secretWord = " Code: Qwerrtyyusbb";
            bos.write(secretWord.getBytes());

        }catch (IOException e){
            e.printStackTrace();
        }
        try (FileReader fr = new FileReader("src/com/pingwit/part_18/homework/task_4/Jenot.webp");
             BufferedReader br = new BufferedReader(fr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
