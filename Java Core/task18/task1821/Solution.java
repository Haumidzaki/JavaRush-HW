package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете).

Пример:
','=44, 's'=115, 't'=116.

Вывести на консоль отсортированный результат:
[символ1] частота1
[символ2] частота2
Закрыть потоки.

Пример вывода:
, 19
- 7
f 361

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток для чтения из файла, который приходит первым параметром в main.
•	В файле необходимо посчитать частоту встречания каждого символа и вывести результат.
•	Выведенный в консоль результат должен быть отсортирован по возрастанию кода ASCII.
•	Поток для чтения из файла должен быть закрыт.
*/

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;

public class Solution {
    public static void main(String[] args) throws IOException {
        String faleName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(faleName));
        ArrayList<Character> list = new ArrayList<>();
        TreeMap<Character, Integer> list1 = new TreeMap<>();
        while (reader.ready()){
            int text = reader.read();
            char text1 = (char) text;
            list.add(text1);
        }
        reader.close();
        for(char i : list){
            list1.put(i,Collections.frequency(list,i));
        }
        for(Map.Entry<Character, Integer> pair : list1.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}