package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с 
файла и поток ввода с клавиатуры.

Требования:
•	Программа должна считывать c консоли имя файла.
•	Программа должна выводить на экран содержимое файла.
•	Поток чтения из файла (FileInputStream) должен быть закрыт.
•	BufferedReader также должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String tssk1 = bufferedReader.readLine();
            FileInputStream fileInputStream = new FileInputStream(tssk1);
            while (fileInputStream.available()>0){
                int text = fileInputStream.read();
                System.out.print((char) text);
            }
            bufferedReader.close();
            fileInputStream.close();
        }catch (Exception e){
            
        }
    }
}