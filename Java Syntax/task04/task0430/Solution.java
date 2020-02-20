package com.javarush.task.task04.task0430;

/* 
От 1 до 10
Вывести на экран числа от 1 до 10 используя цикл while. Каждое значение с новой строки.

Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить числа от 1 до 10.
•	В программе должен использоваться цикл while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1;
       while( a <= 10){
           System.out.println(a);
           a++;
       }
    }
}