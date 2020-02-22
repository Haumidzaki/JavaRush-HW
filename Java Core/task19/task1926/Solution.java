package com.javarush.task.task19.task1926;

/* 
Перевертыши
1. Считать с консоли имя файла. Считать содержимое файла.
2. Для каждой строки в файле:
2.1. переставить все символы в обратном порядке.
2.2. вывести на экран.
3. Закрыть потоки.

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА

Требования:
•	Программа должна считывать имя файла с консоли (используй BufferedReader).
•	BufferedReader для считывания данных с консоли должен быть закрыт.
•	Программа должна считывать содержимое файла (используй FileReader).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна выводить в консоль все символы из файла в обратном порядке.
*/

import java.io.*;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader1.readLine();
        reader1.close();
        FileReader reader = new FileReader(nameFile);
        BufferedReader buffer = new BufferedReader(reader);
        while (buffer.ready()){
            String text = buffer.readLine();
            StringBuilder qwer = new StringBuilder(text);
            qwer.reverse();
            System.out.println(qwer);
        }
        reader.close();
        buffer.close();
    }
}