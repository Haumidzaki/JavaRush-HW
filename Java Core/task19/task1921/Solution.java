package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

/* 
Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String.
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами.

Заполнить список PEOPLE используя данные из файла.
Закрыть потоки.

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013

Требования:
1. Класс Solution должен содержать публичную константу PEOPLE типа List<Person>, которая должна быть сразу проинициализирована.
2. Программа НЕ должна считывать данные с консоли.
3. Программа должна считывать содержимое файла (используй FileReader).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна заполнить список PEOPLE данными из файла.
6. Программа должна правильно работать с двойными именами, например Анна-Надежда.

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main (String[] args) throws IOException, ParseException {
        ArrayList<String> list = new ArrayList<>();
      //  list.add("Иванов Анна-Надежда Иванович 31 12 1987");
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        while (reader.ready()){
            list.add(reader.readLine().trim());
        }
        reader.close();
        for (String text : list){
            String [] text1 = text.split(" ");
            int size = text1.length;
            if(size == 6){
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(text1[0]).append(" ").append(text1[1]).append(" ").append(text1[2]);
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(text1[3] + "-" + text1[4] + "-" + text1[5]);
                Person person = new Person(stringBuilder.toString(), date);
                PEOPLE.add(person);
            }else if (size == 5){
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(text1[0]).append(" ").append(text1[1]);
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(text1[2] + "-" + text1[3] + "-" + text1[4]);
                Person person = new Person(stringBuilder1.toString(), date);
                PEOPLE.add(person);
            }else {
                StringBuilder stringBuilder1 = new StringBuilder();
                stringBuilder1.append(text1[0]);
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                Date date = format.parse(text1[1] + "-" + text1[2] + "-" + text1[3]);
                Person person = new Person(stringBuilder1.toString(), date);
                PEOPLE.add(person);
            }
        }
    }
}
