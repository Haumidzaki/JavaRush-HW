package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
Напиши код метода sumDigitsInNumber(int number). Метод на вход принимает целое трехзначное число. Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

Пример:
Метод sumDigitsInNumber вызывается с параметром 546.

Пример вывода:
15

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Метод sumDigitsInNumber(int) должен быть публичным и статическим.
•	Метод sumDigitsInNumber должен возвращать значение типа int.
•	Метод sumDigitsInNumber не должен ничего выводить на экран.
•	Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
       int a = number / 100 % 10;
       int b = number / 10 % 10;
       int c = number / 1 % 10;
       return a + b + c;
    }
}