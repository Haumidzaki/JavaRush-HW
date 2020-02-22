package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
С консоли считать имя файла.
Посчитать в файле количество символов ',', количество вывести на консоль.
Закрыть потоки.

Подсказка:
нужно сравнивать с ascii-кодом символа ','.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль должно выводится число запятых в считанном файле.
•	Поток чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int count = 0;
        while (fileInputStream.available() > 0){
            Integer text = fileInputStream.read();
            if (text == ','){
                count++;
            }
        }
        scanner.close();
        fileInputStream.close();
        System.out.println(count);
    }
}