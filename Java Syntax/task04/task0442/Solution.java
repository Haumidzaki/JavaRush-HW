package com.javarush.task.task04.task0442;


/* 
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Если пользователь ввел -1, программа должна вывести сумму всех введенных чисел на экран и завершиться.
•	Программа должна посчитать сумму введенных чисел и вывести её на экран.
•	В программе должен использоваться цикл for, while или do-while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    double sum = 0;

        while (true) {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            int number = Integer.parseInt(r.readLine());
            sum = sum + number;
            if (number == -1){
                System.out.println(sum);
                break;
            }
        }
    }
}