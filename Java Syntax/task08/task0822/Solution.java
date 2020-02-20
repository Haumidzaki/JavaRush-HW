package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;



/* 
Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.

Требования:
•	Программа должна выводить текст на экран.
•	Программа должна считывать значения с клавиатуры.
•	Класс Solution должен содержать только три метода.
•	Метод getIntegerList() должен считать с клавиатуры число N, потом вернуть список размером N элементов, заполненный числами с клавиатуры.
•	Метод getMinimum() должен вернуть минимальное число среди элементов списка.
•	Метод main() должен вызывать метод getIntegerList().
•	Метод main() должен вызывать метод getMinimum().
*/

public class Solution {
  public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        List<Integer> in = new LinkedList<Integer>(array);
        return Collections.min(in);
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(reader.readLine());

        for (int i = 0; i < s; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(list.size());
        return list;
    }
}