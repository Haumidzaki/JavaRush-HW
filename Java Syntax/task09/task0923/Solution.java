package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы из введённой строки.
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
Пример ввода:
Мама мыла раму.

Пример вывода:
а а ы а а у
М м м л р м .

Требования:
•	Программа должна считывать данные с клавиатуры.
•	Программа должна выводить две строки.
•	Первая строка должна содержать только гласные буквы из введенной строки, разделенные пробелом.
•	Вторая строка должна содержать только согласные и знаки препинания из введенной строки, разделенные пробелом.
•	Каждая строка должна заканчиваться пробелом.
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        for (int  i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                    char x = text.charAt(i);
                    if (isVowel(x) == true){
                        System.out.print(x);
                        System.out.print(" ");
                }
            }
        }
        System.out.println(" ");
        for (int  i = 0; i < text.length(); i++){
            if (text.charAt(i) != ' '){
                char x = text.charAt(i);
                if (isVowel(x) == false){
                    System.out.print(x);
                    System.out.print(" ");
                }
            }
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char d : vowels){
            if (c == d)
                return true;
        }
        return false;
    }
}