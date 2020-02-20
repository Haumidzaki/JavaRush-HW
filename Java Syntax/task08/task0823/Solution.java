package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать строку с клавиатуры.
•	Класс Solution должен содержать один метод.
•	Программа должна заменять в тексте первые буквы всех слов на заглавные.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String x = s.trim();
        String [] y = x.split(" ");
		
         for(int i = 0; i < y.length; i++){
            String string = y[i];
            char[] chars = string.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                char character = chars[0];
                character = Character.toUpperCase(character);
                chars[0] = character;
            }
            y[i] = String.valueOf(chars);
        }

        for(int i = 0; i < y.length; i++){
            System.out.print(y[i] + " ");
        }
	}
}