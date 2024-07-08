package com.pingwit.part_18.point_6;


import java.io.*;

public class DataInputOutputStreamExample {
    public static void main(String[] args) {
        try {
            String path = "src/com/pingwit/part_18/point_6/dos.txt";
            writeData(path);
            readData(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readData(String path) throws IOException{
        try (FileInputStream fos = new FileInputStream(path);
             DataInputStream dis = new DataInputStream(fos)
        ) {
            boolean b = dis.readBoolean();
            System.out.println(b);

            float floatValue = dis.readFloat();
            System.out.println(floatValue);

            String egorka = dis.readUTF();
            System.out.println(egorka);
        }
    }

    private static void writeData(String path) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(path);
             DataOutputStream dos = new DataOutputStream(fos)
        ) {
            dos.writeBoolean(true);
            dos.writeFloat(1.16f);
            dos.writeUTF("Егорка");

            dos.flush();
        }
    }
}
