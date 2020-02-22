package com.javarush.task.task15.task1527;

import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/* 
Парсер реквестов
Считать с консоли URL-ссылку.
Вывести на экран через пробел список всех параметров 
(Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Выводить параметры нужно в той же последовательности,
в которой они представлены в URL.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк
Обрати внимание на то, что метод alert необходимо вызывать
ПОСЛЕ вывода списка всех параметров на экран.

Пример 1

Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo

Вывод:
lvl view name

Пример 2

Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

Вывод:
obj name
double: 3.14

Требования:
•	Программа должна считывать с клавиатуры только одну строку.
•	Класс Solution не должен содержать статические поля.
•	Программа должна выводить данные на экран в соответствии с условием.
•	Программа должна вызывать метод alert с параметром double в случае,
если значение параметра obj может быть корректно преобразовано в число типа double.
•	Программа должна вызывать метод alert с параметром String в случае,
если значение параметра obj НЕ может быть корректно преобразовано в число типа double.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // для индексов &
        ArrayList<String> list1 = new ArrayList<>(); // для значений
        ArrayList<String> list2 = new ArrayList<>(); // для чисел
        String text = scanner.nextLine();
        int index = text.lastIndexOf("?");
        String text1 = text.substring(index + 1, text.length());
        String text2 = null;
        for(int i = 0; i < text1.length(); i++){
            text2 = String.valueOf(text1.charAt(i));
            if(text2.equalsIgnoreCase("&")){
                int index1 = i;
                list.add(index1);
            }
        }
        int size = list.size() + 1;
        for(int i = 0; i < size; i++){
            if(i == 0){
                String text3 = text1.substring(0,list.get(i));
                list1.add(text3);
            }else if (i == size - 1){
                String text3 = text1.substring(list.get(i - 1) + 1, text1.length());
                list1.add(text3);
            }else {
                String text3 = text1.substring(list.get(i - 1) + 1,list.get(i));
                list1.add(text3);
            }
            for(int q = 0; q < list1.size(); q++){
                String text3 = list1.get(q);
                if(text3.contains("=")){
                    int qweq = text3.indexOf("=");
                    String qwer1 = text3.substring(0,qweq);
                    String qwer2 = text3.substring(qweq + 1, text3.length());
                    if(qwer1.equalsIgnoreCase("obj")){
                        list2.add(qwer2);
                    }
                    list1.set(q, qwer1);
                }
            }
        }

        for(String text7 : list1){
            System.out.print(text7 + " ");
        }
        System.out.println();

        for(int q = 0; q < list2.size(); q++){
                try{
                    alert(Double.parseDouble(list2.get(q)));
                }catch (Exception e){
                    alert(list2.get(q));
                }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value)  {
        System.out.println("String: " + value);
    }
}
