package com.javarush.task.task05.task0530;

import java.io.*;

/* 
Шеф, что-то не пашетЗадача: Программа считывает два числа с клавиатуры и выводит их сумму на экран.

Требования:
•	Программа должна считывать числа с клавиатуры.
•	В классе должен быть только один метод main.
•	Программа должна выводить строку, которая начинается на "Sum = ".
•	Программа должна выводить строку, которая заканчивается суммой введенных чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}