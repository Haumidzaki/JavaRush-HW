package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить число на экран.
•	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
•	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
•	Если введенное число равно нулю, необходимо вывести ноль.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
       String s = r.readLine();
       int x = Integer.valueOf(s);
       if (x == 0){
           System.out.println(x);
       }else if (x > 0){
           x = x*2;
           System.out.println(x);
       }else{
           x = x +1;
           System.out.println(x);
       }
    }
}