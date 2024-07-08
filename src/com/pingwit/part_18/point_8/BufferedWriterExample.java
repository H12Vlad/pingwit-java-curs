package com.pingwit.part_18.point_8;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("src/com/pingwit/part_18/point_7/lady_gaga_bloody_mary.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)
        ){
            bw.write("\n");
            bw.write("to be continued...");

            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
