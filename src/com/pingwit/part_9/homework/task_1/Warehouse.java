package com.pingwit.part_9.homework.task_1;

import java.util.Arrays;
/*
Я хз что делать с методом next ()
Я даже не имею представление как должно выглядеть вывод на экран который написан
" В классе должен быть метод next() который возвращает следующий элемент массива."
(Возможно я знаю но скорее всего я запутался)
 */

public class Warehouse {
    int[] numbers;
    int index;

    public Warehouse(int[] numbers) {
        this.numbers = numbers;
    }


        public int next() {
        if (index == numbers.length - 1) {
            index = 0;
        } else {
            index++;
        }
        return numbers[index];

    }
//    public int next() {
//        index = (index + 1) % numbers.length;
//        return numbers[index];
//    }

    public int[] numbers() {
        int[] clone = new int[numbers.length];
        for (int i = 0; i < clone.length; i++) {
            clone[i] = numbers[i];
        }
        return clone;

    }

    public int[] getArray() {
        return Arrays.copyOf(numbers, numbers.length);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "numbers = " + Arrays.toString(numbers) +
                ", index = " + index +
                '}';
    }
}
