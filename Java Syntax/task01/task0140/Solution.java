package com.javarush.task.task01.task0140;

/* 
Выводим квадрат числа
Дана переменная number.
Напиши программу, которая выводит на экран квадрат этой переменной (number * number).

Требования:
•	У переменной number можно менять только значение.
•	Программа должна выводить текст.
•	Выводимый текст должен быть числом.
•	Выводимый текст должен быть квадратом переменной number.
*/

public class Solution {
    public static int number = 25;

    public static void main(String[] args) {
    number = number * number;
    System.out.println(number);
    }
}