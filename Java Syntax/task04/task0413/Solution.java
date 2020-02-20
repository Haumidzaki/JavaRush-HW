package com.javarush.task.task04.task0413;

/* 
День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран.
•	Если введено число от 1 до 7, необходимо вывести день недели.
•	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
      BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
      String s = r.readLine();
      int x = Integer.valueOf(s);
      if(x == 1){
          System.out.println("понедельник");
      }else if(x == 2){
          System.out.println("вторник");
      }else if(x == 3){
          System.out.println("среда");
      }else if(x == 4){
          System.out.println("четверг");
      }else if(x == 5){
          System.out.println("пятница");
      }else if(x == 6){
          System.out.println("суббота");
      }else if(x == 7){
          System.out.println("воскресенье");
      }else if(x > 7  || x < 1){
          System.out.println("такого дня недели не существует");
      }//на//напишите тут ваш код
    }
}