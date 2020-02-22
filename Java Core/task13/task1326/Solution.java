package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.

Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10

Требования:
•	Программа должна считывать данные с консоли.
•	Программа должна создавать FileInputStream для введенной с консоли строки.
•	Программа должна выводить данные на экран.
•	Программа должна вывести на экран все четные числа считанные из 
файла отсортированные по возрастанию.
•	Программа должна закрывать поток чтения из файла(FileInputStream).
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            Scanner scanner = new Scanner(new FileInputStream(fileName));
            ArrayList<Integer> numberList = new ArrayList<>();
            ArrayList<Integer> numberlist1 = new ArrayList<>();
            while (scanner.hasNextInt()){
                int number = scanner.nextInt();
                if(numberList.contains(number)){

                }
                numberList.add(number);
            }
            Collections.sort(numberList);
            for(int number1 : numberList){
                if(number1%2 == 0){
                    numberlist1.add(number1);
                }
            }
            Collections.sort(numberlist1);
            for (int number2 : numberlist1){
                System.out.println(number2);
            }
            reader.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}