package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Программа должна считывать 5 строк с клавиатуры и записывать их в список.
•	Программа должна выводить самую короткую строку на экран.
•	Если есть несколько строк с длиной равной минимальной, то нужно вывести каждую из них с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int x = Integer.MAX_VALUE;
        
        for (int i = 0; i < 5; i++){
            
            list.add(reader.readLine());
            
            if (list.get(i).length() < x){
                x = list.get(i).length();
            }
        }
  
        for (int i = 0; i < list.size(); i++){

            if (list.get(i).length() == x){
             System.out.println(list.get(i));   
            }
        }
    }
}