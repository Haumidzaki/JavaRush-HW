package com.javarush.task.task03.task0322;

/* 
Большая и чистая
Ввести с клавиатуры три имени, вывести на экран надпись:
name1 + name2 + name3 = Чистая любовь, да-да!

Пример:
Вася + Ева + Анжелика = Чистая любовь, да-да!

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя name1.
•	Выведенный текст должен содержать введенное имя name2.
•	Выведенный текст должен содержать введенное имя name3.
•	Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       String name1 = r.readLine();
       String name2 = r.readLine();
       String name3 = r.readLine();
       System.out.println(name1+" + "+name2+" + "+name3+ " = "+"Чистая любовь, да-да!");
    }
}