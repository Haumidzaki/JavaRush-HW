package com.javarush.task.task18.task1810;

/* 
DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки работы с файлами.
2.2 Выбросить исключение DownloadException.

Требования:
•	Программа должна считать имена файлов с консоли.
•	Для чтения из файлов используй поток FileInputStream.
•	Программа должна работать, пока введенный файл не окажется меньше 1000 байт.
•	Программа должна завершиться исключением DownloadException.
•	Поток FileInputStream должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String nameFile = scanner.nextLine();
            FileInputStream fileInputStream = new FileInputStream(nameFile);
            byte [] byff = new byte[fileInputStream.available()];
            if(fileInputStream.available() > 0){
                int date = fileInputStream.read(byff);
                if(date < 1000){
                    scanner.close();
                    fileInputStream.close();
                    throw new DownloadException();
                }
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}