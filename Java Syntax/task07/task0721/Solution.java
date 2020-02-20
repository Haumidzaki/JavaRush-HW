package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.

Требования:
•	Создай массив целых чисел (int[]) на 20 элементов.
•	Считай с клавиатуры 20 целых чисел и добавь их в массив.
•	Найди и выведи через пробел максимальное и минимальное числа.
•	Используй цикл for.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] number = new int [20];
        int maximum;
        int minimum;

        for (int i = 0; i < number.length; i++){
            number[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(number);
        minimum = number[0];
        maximum = number[19];
        System.out.println(maximum + " " + minimum);
    }
}