package com.javarush.task.task18.task1819;

/* 
Объединение файлов
Считать с консоли 2 имени файла.
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Не используй в программе статические переменные.
3. Для первого файла создай поток для чтения и считай его содержимое.
4. Затем, для первого файла создай поток для записи(поток для записи должен быть один). Для второго - для чтения.
5. Содержимое первого и второго файла нужно объединить в первом файле.
6. Сначала должно идти содержимое второго файла, затем содержимое первого.
7. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String fileName1 = scanner.nextLine();
            String fileName2 = scanner.nextLine();
            FileReader reader = new FileReader(fileName1);
            FileReader reader1 = new FileReader(fileName2);
            FileWriter writer = new FileWriter(fileName1);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while (reader1.ready()){
                writer.write(reader1.read());
            }
            writer.flush();
            while (bufferedReader.ready()){
                writer.write(bufferedReader.readLine());
            }
            writer.flush();
            reader.close();
            reader1.close();
            writer.close();
            bufferedReader.close();
        }catch (Exception e){

        }
    }
}