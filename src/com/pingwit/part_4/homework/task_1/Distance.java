package com.pingwit.part_4.homework.task_1;

/*
а ты проверял вывод своей программы?
у тебя результат чуть больше 19км. Если спортсмен пробегает 10 км в день и бежит 7 дней, то это получится 10*7=70.
При это каждый день он бежал на 10% больше предыдущего дня, т.е. за 7 дней должно быть больше 70км.

Подумай еще над решением, если что разберем на занятии
*/
public class Distance {
    public static void main(String[] args) {
        double firstDayDistance = 10;
        double totalDistance = 0;
        for (int day = 1; day <= 7; day++) {
            totalDistance += firstDayDistance;
            firstDayDistance *= 1.1;
        }
        System.out.println("Суммарный путь спортсмена за 7 дней: " + totalDistance + " км");
    }
}

