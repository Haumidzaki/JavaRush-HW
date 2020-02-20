package com.javarush.task.task04.task0441;


/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вывести любое из них.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить среднее из трех чисел.
•	Если все числа равны, вывести любое из них.
•	Если два числа из трех равны, вывести любое из двух.
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.valueOf(r.readLine());
        int b = Integer.valueOf(r.readLine());
        int c = Integer.valueOf(r.readLine());
        if ((b>a)&(b<c)||(b<a)&(b>c)){
            System.out.println(b);
        }else if ((a>b)&(a<c)||(a<b)&(a>c)){
            System.out.println(a);
        }else if ((c>a)&(c<b)||(c<a)&(c>b)){
            System.out.println(c);
        }else if ((a == b) & (b == c)){
            System.out.println(a|b|c);
        }else if ((a == b) & (a != c)){
            System.out.println(a|b);
        }else if ((a == c)&(a!=b)){
            System.out.println(a|c);
        }else if ((b == c)&(c!=a)){
            System.out.println(b|c);
        }
    }
}