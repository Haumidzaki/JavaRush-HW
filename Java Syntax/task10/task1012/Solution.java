package com.javarush.task.task10.task1012;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.List;

/* 
Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 маленьких букв алфавита). Результат вывести на экран в алфавитном порядке.

Пример вывода:
а 5
б 8
в 3
г 7
д 0
...
я 9

Требования:
•	Программа должна 10 раз считывать данные с клавиатуры.
•	Программа должна выводить текст на экран.
•	Выведенный текст должен содержать 33 строки.
•	Каждая строка вывода должна содержать букву русского алфавита, пробел и сколько раз буква встречалась в введенных строках.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();


        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }


        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < alphabet.size(); i++) {
            int count = 0;

            for (String text:  list){

                for(int q = 0; q < text.length(); q++){
                    char res = text.charAt(q);
                    if(alphabet.get(i).equals(res)){
                        count++;
                    }
                }
            }
            map.putIfAbsent(alphabet.get(i), count);
        }
        for (Map.Entry<Character,Integer> pair: map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}