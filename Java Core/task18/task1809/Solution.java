package com.javarush.task.task18.task1809;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.

Требования:
•	Программа должна два раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, 
для записи в файл - FileOutputStream
•	Во второй файл нужно записать все байты из первого в обратном порядке.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        ArrayList<Integer>list = new ArrayList<>();
        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
        }
        scanner.close();
        fileInputStream.close();
        for(int i = list.size() - 1; i >= 0; i--){
            fileOutputStream.write(list.get(i));
        }
        fileOutputStream.close();
    }
}