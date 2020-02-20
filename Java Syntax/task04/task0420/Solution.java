package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить три числа разделенных пробелами.
•	Программа должна выводить числа в порядке убывания.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.valueOf(r.readLine());
       int b = Integer.valueOf(r.readLine());
       int c = Integer.valueOf(r.readLine());
       if ((a>=b)&(a>=c)&(b>=c)){
           System.out.println(a + " " + b + " " + c);
       }else if ((b>=a)&(b>=c)&(a>=c)){
           System.out.println(b + " " + a + " " + c);
       }else if ((c>=b)&(c>=a)&(b>=a)){
           System.out.println(c + " " + b + " " + a);
       }else if ((c>=b)&(c>=a)&(a>=b)){
           System.out.println(c + " " + a + " " + b);
       }else if ((b>=a)&(b>=c)&(c>=a)){
           System.out.println(b + " " + c + " " + a);
       }else if ((a>=b)&(a>=c)&(c>=b)){
           System.out.println(a + " " + c + " " + b);
       }
    }
}