package com.javarush.task.task19.task1920;

/* 
Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом.

Для каждого имени посчитать сумму всех его значений.
Вывести в консоль имена в алфавитном порядке, у которых максимальная сумма.
Имена разделять пробелом либо выводить с новой строки.
Закрыть потоки.

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое файла (используй FileReader).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна выводить в консоль имена, у которых максимальная сумма.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>list1 = new ArrayList<>();
        HashMap<String, Double> list = new HashMap<>();
        String fileName = args[0];
        FileReader reader = new FileReader(fileName);
        BufferedReader reader1 = new BufferedReader(reader);
        while (reader1.ready()) {
            String text = reader1.readLine();
            list1.add(text.trim());
        }
        reader.close();
        reader1.close();
        for (String text1 : list1){
            String [] text2 = text1.split(" ");
            if(list.containsKey(text2[0])){
                list.put(text2[0],list.get(text2[0]) + Double.parseDouble(text2[1]));
            }else {
                list.put(text2[0],Double.parseDouble(text2[1]));
            }
        }
        Double max = Collections.max(list.values());
            for (Map.Entry<String, Double> pair : list.entrySet()){
                String key = pair.getKey();
                Double val = pair.getValue();
                if(max.equals(val)){
                    System.out.println(key);
                }
            }
        }
    }