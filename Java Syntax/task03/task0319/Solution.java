package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
Ввести с клавиатуры отдельно Имя, число1, число2.
Вывести надпись:
"Имя" получает "число1" через "число2" лет.

Пример:
Коля получает 3000 через 5 лет.

Требования:
•	Программа должна выводить текст.
•	Программа должна считывать данные с клавиатуры.
•	Выведенный текст должен содержать введенное имя.
•	Выведенный текст должен содержать введенное число1.
•	Выведенный текст должен содержать введенное число2.
•	Выведенный тест должен полностью соответствовать заданию.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
     BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
     String name = r.readLine();
     String number1 = r.readLine();
     int number3 = Integer.parseInt(number1);
     String number2 = r.readLine();
     int number4 = Integer.parseInt(number2);
     System.out.println(name + " получает "+ number3 + " через " + number4 + " лет.");
    }
}