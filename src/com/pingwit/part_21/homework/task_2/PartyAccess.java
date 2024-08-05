package com.pingwit.part_21.homework.task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class PartyAccess {
    public static void main(String[] args) {
        ArrayList<String> guestList = new ArrayList<>(); //ArrayList<Integer> list -> List<Integer> guests/whiteList -> лучше использовать интерфейс + название соответствует содержимому
        guestList.add("Mandela Mari");
        guestList.add("Pincho Georgii");
        guestList.add("Libi Adam");
        guestList.add("Guss Archi");
        guestList.add("Petruk Petro");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Скажите ваше имя: ");
        String name = scanner.nextLine();

            if (guestList.contains(name)) { // отформатируй код
                System.out.println("Вы можете пройти.");
            } else {
                System.out.println("Извините, ваше имя не в списке.");
            }
    }
}