package com.javarush.task.task04.task0422;

/* 
18+
Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18 ничего не выводить.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       String a = r.readLine();
       int a1 = Integer.valueOf(r.readLine());
       if (a1 < 18){
           System.out.println("Подрасти еще");
       }
    }
}