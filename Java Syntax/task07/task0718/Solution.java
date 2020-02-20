package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Проверка на упорядоченность
1. Введи с клавиатуры 10 слов в список строк.
2. Определить, является ли список упорядоченным по возрастанию длины строки.
3. В случае отрицательного ответа вывести на экран индекс первого элемента, нарушающего такую упорядоченность.

Требования:
•	Объяви переменную типа список строк и сразу проинициализируй ee.
•	Считай 10 строк с клавиатуры и добавь их в список.
•	Если список упорядочен по возрастанию длины строки, то ничего выводить не нужно.
•	Если список не упорядочен по возрастанию длины строки, то нужно вывести на экран индекс первого элемента, нарушающего такую упорядоченность.
*/

public class Solution {

    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       List<String> list = new ArrayList<>();
       int min = Integer.MAX_VALUE;

       for (int i = 0; i<10; i++){
           list.add(reader.readLine());
       }

       for (int i = 0; i<list.size(); i++) {
           if (list.get(i).length()<min){
               min = list.get(i).length();
           }
       }
       int x = 0;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).length() <= list.get(i).length()) {
               
            }else  if (list.get(i-1).length() >= list.get(i).length()) {
                x = i;
                System.out.println(x);
                break; 
				}
			}
		}
	}