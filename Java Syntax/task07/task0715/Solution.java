package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
1. Создай список из слов "мама", "мыла", "раму".
2. После каждого слова вставь в список строку, содержащую слово "именно".
3. Вывести результат на экран, каждый элемент списка с новой строки.

Требования:
•	Программа не должна считывать данные с клавиатуры.
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Добавь в список слова: «мама», «мыла», «раму».
•	После каждого слова добавь в список строку, содержащую слово «именно».
•	Выведи элементы списка на экран, каждый с новой строки.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
         ArrayList<String> list = new ArrayList<>() ;

         list.add("мама");
         list.add("именно");
         list.add("мыла");
         list.add("именно");
         list.add("раму");
         list.add("именно");

         for (int i = 0; i<list.size(); i++){
             System.out.println(list.get(i));}
    }
}