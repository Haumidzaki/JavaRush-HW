package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.*;

/* 
Знакомство с properties
В методе fillInPropertiesMap считайте имя файла с консоли и заполни карту properties данными из файла.
Про .properties почитать тут - http://ru.wikipedia.org/wiki/.properties
Реализуй логику записи в файл и чтения из файла для карты properties.


Требования:
1. Метод fillInPropertiesMap должен считывать данные с консоли.
2. Метод fillInPropertiesMap должен создавать FileInputStream, передавая считанную строку в качестве параметра.
3. Метод fillInPropertiesMap должен вызывать метод load передавая только что созданный FileInputStream в качестве параметра.
4. Метод save должен сохранять карту properties в полученный в качестве параметра объект типа OutputStream.
5. Метод load должен восстанавливать состояние карты properties из полученного в качестве параметра объекта типа InputStream.
*/

public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        scanner.close();
        load(new FileInputStream(fileName));
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        prop.putAll(properties);
        prop.store(outputStream,"что?");
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();//implement this method - реализуйте этот метод
        prop.load(inputStream);
        properties = new HashMap(prop);
    }

    public static void main(String[] args) {

    }
}