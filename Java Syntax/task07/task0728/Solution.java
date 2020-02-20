package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

Требования:
•	Программа должна считывать 20 целых чисел с клавиатуры.
•	Программа должна выводить 20 чисел.
•	В классе Solution должен быть метод public static void sort(int[] array).
•	Метод main должен вызывать метод sort.
•	Метод sort должен сортировать переданный массив по убыванию.
*/

public class Solution {

   public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
        int[] array1 = new int[array.length];

        for ( int i = 0; i < array1.length; i++){
            array1[19 - i] = array[i];
        }

        for (int i = 0; i < array.length; i++){
            array[i] = array1[i];
        }
    }
}