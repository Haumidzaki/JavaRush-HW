package com.javarush.task.task18.task1804;

import java.io.FileInputStream;
import java.util.*;

/* 
Самые редкие байты
Ввести с консоли имя файла.
Найти байт или байты с минимальным количеством повторов.
Вывести их на экран через пробел.
Закрыть поток ввода-вывода.

Требования:
•	Программа должна считывать имя файла с консоли.
•	Для чтения из файла используй поток FileInputStream.
•	В консоль через пробел должны выводиться все байты из 
файла с минимальным количеством повторов.
•	Данные в консоль должны выводится в одну строку.
•	Поток чтения из файла должен быть закрыт.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String nameFile = scanner.nextLine();
        FileInputStream fileInputStream = new FileInputStream(nameFile);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
        }
        scanner.close();
        fileInputStream.close();

        for(int i = 0; i < list.size(); i++){
            map.put(list.get(i), Collections.frequency(list,list.get(i)));
        }
        int i = Collections.min(map.values());
        for(Map.Entry<Integer,Integer> pair : map.entrySet()){
            if(pair.getValue().equals(i)){
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
