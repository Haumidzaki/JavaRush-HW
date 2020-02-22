package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
Считать с консоли имя файла.
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int).
Закрыть потоки.

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity
где id - int.
productName - название товара, может содержать пробелы, String.
price - цена, double.
quantity - количество, int.

Информация по каждому товару хранится в отдельной строке.

Требования:
•	Программа должна считать имя файла с консоли.
•	Создай для файла поток для чтения.
•	Программа должна найти в файле и вывести информацию о id, который передается первым параметром.
•	Поток для чтения из файла должен быть закрыт.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        int id = Integer.parseInt(args[0]);
        Scanner scanner = new Scanner(System.in);
        String faleName = scanner.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(faleName));
        String text = null;
        String [] buff = new String[1];
        while (reader.ready()){
            text = reader.readLine();
            if (text.startsWith(String.valueOf(id))){
                buff[0] = text;
            }
        }
        System.out.println(buff[0]);
        reader.close();
    }
}