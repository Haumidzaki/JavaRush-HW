package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести числа на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        String b = r.readLine();
        String c = r.readLine();
        int a1 = Integer.valueOf(a);
        int b1 = Integer.valueOf(b);
        int c1 = Integer.valueOf(c);
        if ((a1 == b1) & (a1 == c1)){
            System.out.println(a1 + " " + b1 + " " + c1);
        }else if ((a1 == b1) & (a1 != c1)){
            System.out.println(a1+" "+b1);
        }else if ((a1 != b1) & (a1 == c1)){
            System.out.println(a1+" "+c1);
        }else if ((a1 != b1) & (a1 != c1) & (b1 == c1)){
            System.out.println(b1 + " " + c1);
        }
    }
}