package com.pingwit.part_6.homework.task_5;

import java.util.Arrays;
// отформатируй код
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4};

// лишняя строка
        int leftBorder = 0;
        int rightBorder = array.length - 1;

        while (leftBorder < rightBorder) { // с while ок решение, но здесь красивее смотрелся бы обычный for и бежать до середины массива, быстрее код будет читаться
            int temp = array[leftBorder];
            array[leftBorder] = array[rightBorder];
            array[rightBorder] = temp;

// лишняя строка
            leftBorder++;
            rightBorder--;
// лишняя строка
        }

        System.out.print("Массив после инвертирования: ");

       System.out.println(Arrays.toString(array));
// лишняя строка
        }
    }
// лишняя строка
// лишняя строка
