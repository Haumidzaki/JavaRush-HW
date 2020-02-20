package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
Перехватить исключение, возникающее при выполнении кода:
int a = 42 / 0;
Вывести на экран тип перехваченного исключения.

Требования:
•	Программа должна выводить сообщение на экран.
•	В программе должен быть блок try-catch.
•	Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
•	Выведенное сообщение должно содержать тип возникшего исключения.
•	Имеющийся код в методе main не удалять.
*/

public class Solution {
      public static void main(String[] args) throws Exception {
      try{
      int a = 42 / 0;
	  }
      catch (ArithmeticException e){
      String s = "ArithmeticException";
      System.out.println(s);
	  }
	}
}
