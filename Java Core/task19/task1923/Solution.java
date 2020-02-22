package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со словами, разделенными пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d.
Закрыть потоки.


Требования:
1. Программа НЕ должна считывать данные с консоли.
2. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
3. Поток чтения из файла (FileReader) должен быть закрыт.
4. Программа должна записывать во второй файл все слова из первого файла которые содержат цифры (используй FileWriter).
5. Поток записи в файл (FileWriter) должен быть закрыт.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);
        while (reader.ready()){
            String [] text = reader.readLine().trim().split(" ");
            for(String text1 : text){
                for(int i = 0; i < text1.length(); i++){
                    char qwer = text1.charAt(i);
                    if((qwer >= '0')&(qwer <= '9')){
                        writer.write(text1 + " ");
                        break;
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
