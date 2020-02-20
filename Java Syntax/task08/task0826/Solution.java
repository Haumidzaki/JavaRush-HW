package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

/* 
Пять победителей
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Вывести пять наибольших чисел.
Каждое значение с новой строки.

Требования:
•	Программа должна выводить числа на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать два метода.
•	Метод sort() должен сортировать массив чисел от большего к меньшему.
•	Метод main() должен вызывать метод sort().
•	Программа должна выводить пять наибольших чисел массива. Каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int[] array1 = Arrays.copyOf(array,array.length);

        for (int i = 0; i < array.length; i++){
            array[i] = array1[(array1.length - 1) - i];
        }
    }
}
