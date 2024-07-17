package com.pingwit.part_19.homework.task_3;

import java.io.File;

// очень хорошо
public class DirectoryStructurePrinter {
    public static void main(String[] args) {
        File directory = new File("/Users/alexfomin/IdeaProjects/pingwit/pingwit-java-students/pingwit-java-curs/src/com/pingwit");
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("The specified path is not a directory or does not exist.");
            return;
        }
        printFileStructure("", directory.listFiles());
    }

    private static void printFileStructure(String tab, File[] files) {
        if (files == null) {
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                System.out.println(tab + file.getName() + " (file)");
            } else if (file.isDirectory()) {
                System.out.println(tab + file.getName() + " (catalog)");
                printFileStructure(tab + "\t", file.listFiles());
            }
        }
    }
}