package com.javarush.task.task04.task0424;

/* 
Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команды System.out.println() или System.out.print().
•	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
•	Если все числа разные, ничего не выводить.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       int a1 = Integer.valueOf(r.readLine());
       int b1 = Integer.valueOf(r.readLine());
       int c1 = Integer.valueOf(r.readLine());
       if ((a1!=b1)&(a1!=c1)&(b1==c1)){
           System.out.println("1");
       }else if ((b1!=a1)&(b1!=c1)&(a1==c1)){
           System.out.println("2");
       }else if ((c1!=a1)&(c1!=b1)&(a1==b1)){
           System.out.println("3");
       }
    }
}