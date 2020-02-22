package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени.
Закрыть потоки.

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль каждое имя и сумму всех его значений, все данные должны быть отсортированы в возрастающем порядке по имени.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeMap<String,Double>list = new TreeMap<>();
     /*   list.put("Петров", 2.0);
        list.put("Сидоров", 6.0);
        list.put("Иванов", 1.35);
        list.put("Петров", 3.1);*/

        String fileName = args[0];
        FileReader reader = new FileReader(fileName);
        BufferedReader reader1 = new BufferedReader(reader);
        while (reader1.ready()){
            String [] text = reader1.readLine().trim().split(" ");
            if(list.containsKey(text[0])){
                if(list.containsKey(text[0]))
                    list.put(text[0], list.get(text[0]) + Double.parseDouble(text[1]));
            }else
            list.put(text[0],Double.parseDouble(text[1]));
        }
        reader1.close();
        reader.close();

        for (Map.Entry<String,Double> pair : list.entrySet()){
            String key = pair.getKey();
            Double val = pair.getValue();
            System.out.println(key + " " + val);
        }
    }
}