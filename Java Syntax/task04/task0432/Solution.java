package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить на экран строку N раз.
•	В программе должен использоваться цикл while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String a = r.readLine();
        int b = Integer.valueOf(r.readLine());
        while(b>0){
            System.out.println(a);
            b--;
        }
    }
}