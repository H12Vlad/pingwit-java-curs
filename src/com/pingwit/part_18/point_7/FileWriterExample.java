package com.pingwit.part_18.point_7;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/com/pingwit/part_18/point_7/lady_gaga_bloody_mary.txt", true)){
            fw.write("\n");
            fw.write("to be continued...");

            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
