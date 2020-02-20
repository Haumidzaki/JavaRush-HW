package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна выводить 10 строчек, каждую с новой строки.
•	Массив должен быть выведен на экран в обратном порядке.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] x = new int[10];
        for (int i = 0; i < x.length; i++){
           x[i] = Integer.parseInt(reader.readLine());
       }
	   
	   for (int i = 9; i >= 0; i--){
            System.out.println(x[i]);
        }
    }
}
