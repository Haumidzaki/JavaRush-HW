package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел
сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла.
2. Считать построчно данные из файлов. Из первого 
файла - в allLines, из второго - в forRemoveLines.
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines,
то удалить из списка allLines все строки, которые есть в forRemoveLines.
4. Если условие из п.3 не выполнено, то:
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Метод joinData должен вызываться в main. Все исключения обработайте в методе main.
Не забудь закрыть потоки.

Требования:
•	Класс Solution должен содержать public static поле allLines типа List<String>.
•	Класс Solution должен содержать public static поле forRemoveLines типа List<String>.
•	Класс Solution должен содержать public void метод 
joinData() который может бросать исключение CorruptedDataException.
•	Программа должна считывать c консоли имена двух файлов.
•	Программа должна считывать построчно данные из первого 
файла в список allLines.
•	Программа должна считывать построчно данные из второго 
файла в список forRemoveLines.
•	Метод joinData должен удалить в списке allLines все 
строки из списка forRemoveLines, если в allLines содержаться 
все строки из списка forRemoveLines.
•	Метод joinData должен очистить список allLines и 
выбросить исключение CorruptedDataException, если в allLines 
не содержаться все строки из списка forRemoveLines.
•	Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String text;
        String text1;
        Scanner scanner = new Scanner(System.in);
        String nameFile1 = scanner.nextLine();
        String nameFile2 = scanner.nextLine();
        FileReader reader = new FileReader(nameFile1);
        FileReader reader1 = new FileReader(nameFile2);
        BufferedReader bufferedReader = new BufferedReader(reader);
        BufferedReader bufferedReader1 = new BufferedReader(reader1);
        while (bufferedReader.ready()){
            text = bufferedReader.readLine();
            allLines.add(text);
        }
        while (bufferedReader1.ready()){
            text1 = bufferedReader1.readLine();
            forRemoveLines.add(text1);
        }
        reader.close();
        reader1.close();
        bufferedReader.close();
        bufferedReader1.close();
        scanner.close();
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException, FileNotFoundException, Exception  {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}