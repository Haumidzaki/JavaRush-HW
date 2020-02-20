package com.javarush.task.task03.task0320;


/* 
Скромность украшает программиста
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!

Пример:
Тимур зарабатывает $5,000. Ха-ха-ха!

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен полностью соответствовать заданию.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      String name =r.readLine();
      System.out.println(name+" зарабатывает $5,000. Ха-ха-ха!");
    }
}