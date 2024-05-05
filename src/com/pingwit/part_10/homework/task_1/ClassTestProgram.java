package com.pingwit.part_10.homework.task_1;

public class ClassTestProgram {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        Laptop laptop = new Laptop();
        Server server = new Server();

        desktop.powerOn();
        desktop.powerOff();
        desktop.reset();

        System.out.println("-------------");
        laptop.powerOn();
        laptop.powerOff();
        laptop.reset();

        System.out.println("-------------");
        server.powerOn();
        server.powerOff();
        server.reset();
    }
}
