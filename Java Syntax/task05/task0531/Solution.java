package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Совершенствуем функциональность
Текущая реализация: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	В классе должен быть метод public static void main.
•	В классе должен быть метод public static min, принимающий 5 параметров типа int.
•	Метод min должен возвращать минимум из 5 переданных чисел. Если минимальных чисел несколько - вернуть любое из них.
•	Программа должна выводить строку, которая начинается на "Minimum = ".
•	Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        if ((a <= b) & (a<=c) & (a<=d) & (a<=e)){
            return a;
        }else if ((b <= a) & (b <= c) & (b <= d) & (b <= e)){
            return b;
        }else if ((c <= a) & (c <= b) & (c <= d) & (c <= e)){
            return c;
        }else if ((d <= a) & (d <= b) & (d <= c) & (d <= e)){
            return d;
        }else if ((e <= a) & (e <= b) & (e <= c) & (e <= d)){
            return e;
        }
        return a|b|c|d|e;  
    }  
}