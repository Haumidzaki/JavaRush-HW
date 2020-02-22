package com.javarush.task.task18.task1802;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Минимальный байт
Ввести с консоли имя файла.
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться минимальный байт, считанный из файла.
•	Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data = Integer.MAX_VALUE;
        while (fileInputStream.available() > 0){
            int x = fileInputStream.read();
            if(data > x){
                data = x;
            }
        }
        System.out.println(data);
        scanner.close();
        fileInputStream.close();
    }
}