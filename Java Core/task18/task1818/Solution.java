package com.javarush.task.task18.task1818;

/*
Два в одном
Считать с консоли 3 имени файла.
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла.
Закрыть потоки.


Требования:
1. Программа должна три раза считать имена файлов с консоли.
2. Для первого файла создай поток для записи. Для двух других - потоки для чтения.
3. Содержимое второго файла нужно переписать в первый файл.
4. Содержимое третьего файла нужно дописать в первый файл (в который уже записан второй файл).
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String fileName1 = scanner.nextLine();
        String fileName2 = scanner.nextLine();
        String fileName3 = scanner.nextLine();
        FileReader reader = new FileReader(fileName2);
        FileReader reader1 = new FileReader(fileName3);
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedReader bufferedReader1 = new BufferedReader(reader1);
        FileWriter fileWriter = new FileWriter(fileName1);
        while (bufferedReader.ready()){
            fileWriter.write(bufferedReader.readLine());
        }
        fileWriter.flush();
        while (bufferedReader1.ready()){
            fileWriter.write(bufferedReader1.readLine());
        }
        fileWriter.flush();
        reader.close();
        reader1.close();
        bufferedReader.close();
        bufferedReader1.close();
        fileWriter.close();
    }
}