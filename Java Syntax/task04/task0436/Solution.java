package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888

Требования:
•	Программа должна считывать два числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить прямоугольник размером m на n из восьмёрок.
•	В программе должен использоваться цикл for.
*/

import java.io.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);
        int m = scaner.nextInt();
        Scanner scaner1 = new Scanner(System.in);
        int n = scaner1.nextInt();
        for ( int j=1; j<=m; j++){
            for ( int i=1; i<=n; i++){
                    System.out.print(8);
                }
			System.out.println(" ");
        }
    }
}
