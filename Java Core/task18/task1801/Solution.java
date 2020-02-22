package com.javarush.task.task18.task1801;

import java.io.FileInputStream;
import java.util.Scanner;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должен выводиться максимальный байт, считанный из файла.
•	Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int data = 0;
        while (fileInputStream.available() > 0){
            int x = fileInputStream.read();
            if(data < x){
                data = x;
            }
        }
        System.out.println(data);
        fileInputStream.close();
        scanner.close();
    }
}