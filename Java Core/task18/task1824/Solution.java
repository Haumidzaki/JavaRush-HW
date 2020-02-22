package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
Читайте с консоли имена файлов.
Если файла не существует (передано неправильное имя файла), то перехватить исключение FileNotFoundException, вывести в консоль переданное неправильное имя файла и завершить работу программы.
Закрыть потоки.
Не используйте System.exit();

Требования:
•	Программа должна считывать имена файлов с консоли.
•	Для каждого файла нужно создавать поток для чтения.
•	Если файл не существует, программа должна перехватывать исключение FileNotFoundException.
•	После перехвата исключения, программа должна вывести имя файла в консоль и завершить работу.
•	Потоки для чтения из файла должны быть закрыты.
•	Команду "System.exit();" использовать нельзя.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String fileName = scanner.nextLine();
            try {
                FileReader reader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(reader);
                reader.close();
                bufferedReader.close();
            }catch (Exception e){
                System.out.println(fileName);

            }
        }scanner.close();
    }
}