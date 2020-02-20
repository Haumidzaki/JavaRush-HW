package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.

Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное - утраивается.
Программа выводит содержимое нового списка на экран.

Пример ввода:
Кот
Коты
Я

Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна вывести столько же строк, сколько было введено.
•	Если в строке было четное число букв, то необходимо удвоить строку (как в примере).
•	Если в строке было нечетное число букв, то необходимо утроить строку (как в примере).
•	Программа должна прекращать считывать данные с клавиатуры как только пользователь введет пустую строку и нажмет Enter.
*/

public class Solution {

   public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        ArrayList<String> listUpperCase = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.length()%2 == 0){
                listUpperCase.add(s + " " + s);
            }else if (s.length()%2 == 1){
                listUpperCase.add(s + " " + s + " " + s);
            }else if (s.length() == 1){
                listUpperCase.add(s + s + s);
            }
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }
    }
}
