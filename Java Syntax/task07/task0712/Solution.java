package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
•	Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
•	Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
•	Должна быть выведена только одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
         ArrayList<String> list = new ArrayList<>();
         ArrayList<String> list1 = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.MIN_VALUE; // минимальный размер
        int y = Integer.MAX_VALUE;// максимальный размер
        int q = 0;
        int w = 0;


        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }

        // находим минимальную строку и максимальную строку
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).length() < y){
                y = list.get(i).length();
            }else if (list.get(i).length() > x){
                x = list.get(i).length();
            }
        }
        
        // узнаем номер ячейки где находится самая минимальная строка и максимальная
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).length() == y){
                list1.add(list.get(i));
            }else if(list.get(i).length() == x){
                 list1.add(list.get(i));
            }
        }
		System.out.println(list1.get(0));
    }
}