package com.pingwit.part_18.homework.task_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFileBober {
    public static void main(String[] args) {
        String sourcePath = "src/com/pingwit/part_18/homework/task_5/Bober.png";
        File destinationFile = getFile(sourcePath);

        try (FileInputStream fis = new FileInputStream(sourcePath);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {
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

    private static File getFile(String sourcePath) {
        String destinationPath = "src/com/pingwit/part_18/homework/task_5/";

        File sourceFile = new File(sourcePath);
        String fileName = sourceFile.getName();

        int lastDotIndex = fileName.lastIndexOf('.');
        boolean hasExtension = lastDotIndex == -1;
        String nameWithoutExtension = (hasExtension) ? fileName : fileName.substring(0, lastDotIndex);
        String extension = (hasExtension) ? "" : fileName.substring(lastDotIndex);

        String copyName = nameWithoutExtension + "_copy" + extension;

        File destinationFile = new File(destinationPath + copyName);
        int copyIndex = 1;
        while (destinationFile.exists()) {
            copyName = nameWithoutExtension + "_copy(" + copyIndex + ")" + extension;
            destinationFile = new File(destinationPath + copyName);
            copyIndex++;
        }
        return destinationFile;
    }
}