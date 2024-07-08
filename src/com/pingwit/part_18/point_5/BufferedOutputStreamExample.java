package com.pingwit.part_18.point_5;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("src/com/pingwit/part_18/point_5/bos_output.txt", true);
            BufferedOutputStream bos = new BufferedOutputStream(fos)
        ){
            bos.write(666);

            bos.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
