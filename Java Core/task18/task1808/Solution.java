package com.javarush.task.task18.task1808;

/* 
Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
Закрыть потоки.

Требования:
•	Программа должна три раза считать имена файлов с консоли.
•	Для чтения из файла используй поток FileInputStream, для 
записи в файлы - FileOutputStream
•	Первую половину байт из первого файла нужно записать во второй файл.
•	Вторую половину байт из первого файла нужно записать в третий файл.
•	Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        String fileName3 = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        FileOutputStream fileOutputStream1 = new FileOutputStream(fileName3);
        byte [] buffer = new byte[fileInputStream.available()];
        if(fileInputStream.available() > 0) {
            count = fileInputStream.read(buffer);
            scanner.close();
            fileInputStream.close();
            if(count%2 == 1){
                fileOutputStream.write(buffer, 0, count - count/2);
                fileOutputStream1.write(buffer, count - count/2, count/2);
            }else {
                fileOutputStream.write(buffer, 0, count/2);
                fileOutputStream1.write(buffer, count/2, count/2);
            }
            scanner.close();
            fileInputStream.close();
            fileOutputStream.close();
            fileOutputStream1.close();
        }
        scanner.close();
        fileInputStream.close();
        fileOutputStream.close();
        fileOutputStream1.close();
    }
}