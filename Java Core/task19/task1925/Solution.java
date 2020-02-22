package com.javarush.task.task19.task1925;

/* 
Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6.
В конце файла2 запятой не должно быть.
Закрыть потоки.

Пример выходных данных в файл2:
длинное,короткое,аббревиатура

Требования:
•	Программа НЕ должна считывать данные с консоли.
•	Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
•	Поток чтения из файла (FileReader) должен быть закрыт.
•	Программа должна записывать через запятую во второй файл все слова из первого файла длина которых строго больше 6(используй FileWriter).
•	Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        String nameFile1 = args[0];
        String nameFile2 = args[1];
        FileReader fileReader = new FileReader(nameFile1);
        BufferedReader reader1 = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(nameFile2);
        ArrayList<String> list = new ArrayList<>();
        while (reader1.ready()){
            String [] text = reader1.readLine().split(" ");
            for (String res : text){
                if(res.length() > 6){
                    list.add(res);
                }
            }
        }
        fileReader.close();
        reader1.close();
        for (int i = 0; i < list.size(); i++){
            if(i == list.size() - 1){
                fileWriter.write(list.get(i));
                fileWriter.flush();
                fileWriter.close();
            }else {
                fileWriter.write(list.get(i) + ",");
                fileWriter.flush();
            }
        }
    }
}