package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader reader1 = new FileReader(fileName);
        BufferedReader reader2 = new BufferedReader(reader1);
        while (reader2.ready()){
            String [] text = reader2.readLine().split("\\s*(\\s|,|!|\\.)\\s*");
            for (String text1 : text){
                list.add(text1);
            }
        }
        reader1.close();
        reader2.close();
        for(String text2 : list){
            if(text2.equalsIgnoreCase("world")){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}