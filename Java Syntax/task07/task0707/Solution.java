package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

Требования:
•	Программа не должна ничего считывать с клавиатуры.
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Программа должна добавить 5 любых строк в список.
•	Программа должна вывести размер списка на экран.
•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<>();

        list.add("строка 1");
        list.add("строка 2");
        list.add("строка 3");
        list.add("строка 4");
        list.add("строка 5");

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}