package com.javarush.task.task19.task1908;

/* 
Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки.

Пример тела файла:
12 text var2 14 8ю 1

Результат:
12 14 1

Требования:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором принимающим FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл все числа, через пробел, из первого файла (используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileReader reader1 = new FileReader(fileName1);
        BufferedReader reader2 = new BufferedReader(reader1);
        FileWriter writer = new FileWriter(fileName2);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        while (reader2.ready()){
            String [] text = reader2.readLine().trim().split(" ");
            for (int i = 0; i < text.length; i++){
                list.add(text[i].trim());
            }
        }

        for (String text1 : list){
            int count = text1.length();
            int count1 = 0;
            for(int i = 0; i < text1.length(); i++){
                char w = text1.charAt(i);
                if((w >= '0')&&(w <= '9')){
                    count1++;
                }
                if (count1 == count){
                    list1.add(Integer.parseInt(text1));
                }
            }
        }

        reader1.close();
        reader2.close();
        stringBuilder = new StringBuilder();
        for(int i = 0; i < list1.size(); i++){
            stringBuilder.append(list1.get(i) + " ");
        }
        String text2 = stringBuilder.toString().trim();
        bufferedWriter.write(text2);
        bufferedWriter.flush();
        writer.close();
        bufferedWriter.close();
    }
}