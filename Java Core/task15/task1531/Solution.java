package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


/* 
Факториал
Написать метод, который вычисляет факториал - произведение всех 
чисел от 1 до введенного числа включая его.

Пример вычислений: 4! = factorial(4) = 1*2*3*4
Пример вывода: 24

1. Ввести с консоли число меньше либо равно 150.
2. Реализовать функцию factorial.
3. Если введенное число меньше 0, то вывести 0.
0! = 1

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить на экран факториал введенного числа.
•	Метод factorial должен возвращать строковое представление
факториала числа переданного ему в качестве параметра.
•	Метод factorial должен принимать один параметр типа int.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger num = BigInteger.valueOf(1);
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(0);
        BigInteger q = BigInteger.valueOf(n);
        if (n < 0){
            return String.valueOf(0);
        }else if (n == 0){
            return String.valueOf(1);
        }else if(n == 1){
            return String.valueOf(1);
        } else {
        for(BigInteger i = BigInteger.valueOf(2); i.intValue()<=q.intValue();){
            num1 = num.multiply(i);
            num2 = num1;
            num = num1;
            i = BigInteger.valueOf(i.intValue() + 1);
        }
        return String.valueOf(num2);
        }
    }
}