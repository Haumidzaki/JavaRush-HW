package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

/* 
Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit".
Передайте имя файла в нить ReadThread.
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки.

Требования:
•	Программа должна считывать имена файлов с консоли, пока не будет введено слово "exit".
•	Для каждого файла создай нить ReadThread и запусти ее.
•	После запуска каждая нить ReadThread должна создать свой поток для чтения из файла.
•	Затем нити должны найти максимально встречающийся байт в своем файле и добавить его в словарь resultMap.
•	Поток для чтения из файла в каждой нити должен быть закрыт.
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String fileName = scanner.nextLine();
            if(fileName.equalsIgnoreCase("exit")){
                break;
            }else {
                new ReadThread(fileName).start();
            }
        }
    }

    public static class ReadThread extends Thread {
        String fileName = null;
        ArrayList<Integer>list = new ArrayList<>();
        TreeMap<Integer,Integer>map = new TreeMap<>();

        public ReadThread(String fileName) {
            this.fileName = fileName;//implement constructor body
        }
        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(fileName));
                while (reader.ready()){
                    int text = reader.read();
                    list.add(text);
                }
                for(int q : list){
                    map.put(q,Collections.frequency(list,q));
                }
                int result = 0;
                int count = Integer.MIN_VALUE;
                for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
                    int q = pair.getValue();
                    if(q > count){
                        count = q;
                        result = pair.getKey();
                    }
                }
               resultMap.put(fileName,result);
               reader.close();
            }catch (Exception e){
                getStackTrace();
            }
        }
    }
}