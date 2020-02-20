package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное из четырёх чисел.
•	Если максимальных чисел несколько, необходимо вывести любое из них.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       String a = r.readLine();
       String b = r.readLine();
       String c = r.readLine();
       String d = r.readLine();
       int a1 = Integer.valueOf(a);
       int b1 = Integer.valueOf(b);
       int c1 = Integer.valueOf(c);
       int d1 = Integer.valueOf(d);
       int max = Math.max(Math.max(a1,b1),Math.max(c1,d1));
       System.out.println(max);
    }
}