package com.javarush.task.task18.task1816;

/* 
Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв).
Закрыть потоки.

Требования:
•	Считывать с консоли ничего не нужно.
•	Создай поток чтения из файла, который приходит первым параметром в main.
•	В файле необходимо посчитать буквы английского алфавита и вывести это число в консоль.
•	Нужно учитывать заглавные и строчные буквы.
•	Поток чтения из файла должен быть закрыт.
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        int count = 0;

        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if ( (data >= 'a' && data <= 'z') || (data >= 'A' && data <= 'Z'))
                count++;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
