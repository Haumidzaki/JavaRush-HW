package com.javarush.task.task18.task1805;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Сортировка байт
Ввести с консоли имя файла.
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран.
Закрыть поток ввода-вывода.

Пример байт входного файла:
44 83 44

Пример вывода:
44 83

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все
уникальные байты из файла в порядке возрастания.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        while (fileInputStream.available() > 0)
        {
            list.add(fileInputStream.read());
        }
        scanner.close();
        fileInputStream.close();
        for(int i : list)
        {
            if(list1.contains(i))
            {

            }
            else
                {
                list1.add(i);
                }
        }
        Collections.sort(list1);
        for( int i : list1){
            System.out.print(i + " ");
        }
    }
}