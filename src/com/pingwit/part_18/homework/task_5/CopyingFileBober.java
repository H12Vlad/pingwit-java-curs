package com.pingwit.part_18.homework.task_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFileBober {
    public static void main(String[] args) {
        String sourcePath = "src/com/pingwit/part_18/homework/task_5/Bober.png";
        String destinationPath = "src/com/pingwit/part_18/homework/task_5/";
        String copyName = "Bober_copy.png";

        File destinationFile = new File(destinationPath + copyName);
        int copyIndex = 1;
        while (destinationFile.exists()) {
            copyName = "Bober_copy(" + copyIndex + ").png";
            destinationFile = new File(destinationPath + copyName);
            copyIndex++;
        }

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationFile)
        ) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}