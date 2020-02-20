package com.javarush.task.task03.task0318;

/* 
План по захвату мира
Ввести с клавиатуры число и имя, вывести на экран строку:
"имя" захватит мир через "число" лет. Му-ха-ха!

Пример:
Вася захватит мир через 8 лет. Му-ха-ха!

Последовательность вводимых данных имеет большое значение.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число.
•	Выведенный текст должен полностью соответствовать заданию.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader  r = new BufferedReader(new InputStreamReader(System.in));
       String age = r.readLine();
       int age1 = Integer.parseInt(age);
       String name = r.readLine();
       System.out.println(name +" захватит мир через "+ age1+ " лет. Му-ха-ха!");
    }
}