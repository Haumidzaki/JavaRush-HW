package com.javarush.task.task01.task0108;

/* 
2 + 3 = 5
Закомментируй ненужные строки кода, чтобы на экран вывелась надпись:
2 плюс 3 равно 5
Примечание: комментировать строки с объявлением переменных нельзя.

Требования:
•	Программа должна выводить на экран надпись "2 плюс 3 равно 5"
•	Нельзя изменять строку с объявлением переменных.
•	Нужно закомментировать хотя бы одну строку.
•	Нельзя изменять (можно закомментировать) или добавлять команды, отвечающие за вывод.
*/

public class Solution {
    public static void main(String[] args) {
        String s = "23";
        int a = 3, b = 2;
        String four = "четыре";
        String three = "3";

     /* System.out.print("два");
        System.out.print(" плюс ");
        System.out.print(s); */
        System.out.print(b);
        System.out.print(" плюс ");
     /* System.out.print("три"); */
        System.out.print(a);
        System.out.print(" равно ");
     /* System.out.print("пять"); */
        System.out.print(a + b);
    }
}