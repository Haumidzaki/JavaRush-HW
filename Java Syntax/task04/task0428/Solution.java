package com.javarush.task.task04.task0428;

/* 
Положительное число
числа. Вывести на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если положительных чисел нет, программа должна вывести "0".
•	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(r.readLine());
        int b = Integer.valueOf(r.readLine());
        int c = Integer.valueOf(r.readLine());
        if((a>0)&(b>0)&(c>0)){
            System.out.println("3");
        }else if(((a<=0)&(b>0)&(c>0))|((a>0)&(b<=0)&(c>0))|((a>0)&(b>0)&(c<=0))){
            System.out.println("2");
        }else if(((a<=0)&(b<=0)&(c>0))|((a>0)&(b<=0)&(c<=0))|((a<=0)&(b>0)&(c<=0))){
            System.out.println("1");
        }else if((a<=0)&(b<=0)&(c<=0)){
        System.out.println("0");
        }
    }
}