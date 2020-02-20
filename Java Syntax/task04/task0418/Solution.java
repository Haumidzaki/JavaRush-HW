package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       String s = r.readLine();
       String c = r.readLine();
       int x = Integer.valueOf(s);
       int y = Integer.valueOf(c);
       if (x>y){
           System.out.println(y);
       }else if (x<y){
           System.out.println(x);
       }else
       System.out.println(x|y);
    }
}