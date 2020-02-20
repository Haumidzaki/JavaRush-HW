package com.javarush.task.task04.task0431;

/* 
От 10 до 1
Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.

Требования:
•	Программа не должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить числа от 10 до 1.
•	В программе должен использоваться цикл while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
       int a = 10;
       while( a >= 1){
           System.out.println(a);
           a--;
       }
    }
}