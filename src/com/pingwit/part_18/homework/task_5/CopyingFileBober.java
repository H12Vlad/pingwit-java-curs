package com.pingwit.part_18.homework.task_5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyingFileBober {
    public static void main(String[] args) {
        String sourcePath = "src/com/pingwit/part_18/homework/task_5/Bober.png";
        String destinationPath = "src/com/pingwit/part_18/homework/task_5/";
        /* программа должна уметь работать с разными файлами, поэтому
        File sourceFile = new File(sourcePath);
        String fileName = sourceFile.getName();
        Затем находим у файла последнюю точку - это будет расширение и слово copy вставляем перед точкой, пригодится метод substring
         */
        String copyName = "Bober_copy.png"; // здесь будет что-то вроде fileName.substring(до точки) + copy + fileName.substring(точка+расширение)

        File destinationFile = new File(destinationPath + copyName);
        int copyIndex = 1;
        while (destinationFile.exists()) {
            copyName = "Bober_copy(" + copyIndex + ").png";
            destinationFile = new File(destinationPath + copyName); // destinationPath -> sourceFile.getParent() + / + название_файла_копии
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