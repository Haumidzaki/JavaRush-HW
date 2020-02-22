package com.javarush.task.task18.task1817;

/* 
Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов 
к количеству всех символов. Например, 10.45.
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой.
4. Закрыть потоки.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток чтения из файла, который приходит первым параметром в main.
•	Посчитай отношение пробелов ко всем символам в файле и выведи в консоль это число.
•	Выведенное значение необходимо округлить до 2 знаков после запятой.
•	Поток чтения из файла должен быть закрыт.
*/

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String nameFile = args[0];
        int countAll = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(nameFile);
        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        countAll = list.size();
        for(int text : list){
            if(text == ' '){
                count++;
            }
        }
        double finish = (double)count/(double)countAll*100;
        double newFinish = BigDecimal.valueOf(finish).setScale(2, RoundingMode.UP).doubleValue();
        System.out.println(newFinish);
    }
}