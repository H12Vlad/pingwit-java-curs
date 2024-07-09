package com.pingwit.part_18.homework.task_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFileBober {
    public static void main(String[] args) {
        String sourcePath = "src/com/pingwit/part_18/homework/task_5/Bober.png";
        String destinationPath = "src/com/pingwit/part_18/homework/task_5/";

        File sourceFile = new File(sourcePath);
        String fileName = sourceFile.getName();

        int dotIndex = fileName.lastIndexOf('.');
        String nameWithoutExtension = (dotIndex == -1) ? fileName : fileName.substring(0, dotIndex);
        String extension = (dotIndex == -1) ? "" : fileName.substring(dotIndex);

        String copyName = nameWithoutExtension + "_copy" + extension;

        File destinationFile = new File(destinationPath + copyName);
        int copyIndex = 1;
        while (destinationFile.exists()) {
            copyName = nameWithoutExtension + "_copy(" + copyIndex + ")" + extension;
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

            System.out.println("Файл успешно скопирован: " + destinationFile.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}