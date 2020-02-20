package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.

Требования:
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Считай 5 строк с клавиатуры и добавь их в список.
•	Удали третий элемент списка.
•	Выведи элементы на экран, каждый с новой строки.
•	Порядок вывода должен быть обратный.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<String> list = new ArrayList<>();
		
        for (int i = 0; i < 5; i++){
            list.add(reader.readLine());
    }
	
    list.remove(2);
	
    for (int i = list.size() - 1; i >= 0; i--){
        System.out.println(list.get(i));
        }
	}
}