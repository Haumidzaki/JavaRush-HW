package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.

Требования:
•	Программа должна считывать две строки c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если имена одинаковые вывести сообщение "Имена идентичны"
•	Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
•	Если имена и длины имен разные - ничего не выводить.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       String a = r.readLine();
       String b = r.readLine();
       if (a.equals(b)){
       System.out.println("Имена идентичны");
       }else if (a.length() == b.length()){
           System.out.println("Длины имен равны");
       }
    }
}