package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int x = 0;
        
        for (int i = 0; i < 5; i++){
            strings.add(reader.readLine()); 
            
            if (strings.get(i).length() > x){
                x = strings.get(i).length();
            }
        }
   
        for (int i = 0; i < strings.size(); i++){

            if (strings.get(i).length() == x){
             System.out.println(strings.get(i));   
            }
        }
    }
}