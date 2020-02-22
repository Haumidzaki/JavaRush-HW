package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.

Требования:
•	Программа должна считывать c консоли имя файла.
•	Создай и используй объект типа BufferedWriter.
•	Программа не должна ничего читать из файловой системы.
•	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
•	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
•	Метод main должен закрывать объект типа BufferedWriter после использования.
•	Метод main не должен выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            FileWriter file = new FileWriter(fileName);
            BufferedWriter fileWriter = new BufferedWriter(file);
            while (true){
                String text = reader.readLine();
                if(text.equalsIgnoreCase("exit")){
                    fileWriter.write(text);
                    fileWriter.newLine();
                    fileWriter.flush();
                    reader.close();
                    file.close();
                    fileWriter.close();
                    break;
                }else {
                    fileWriter.write(text);
                    fileWriter.newLine();
                    fileWriter.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}