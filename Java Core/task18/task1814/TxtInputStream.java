package com.javarush.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
UnsupportedFileName
Измени класс TxtInputStream так, чтобы он 
работал только с txt-файлами (*.txt).
Например, first.txt или name.1.part3.txt.
Если передан не txt-файл, например, file.txt.exe, 
то конструктор должен выбрасывать исключение UnsupportedFileNameException.
Подумай, что еще нужно сделать, в случае выброшенного исключения.

Требования:
•	Класс TxtInputStream должен наследоваться от класса FileInputStream.
•	Если в конструктор передан txt-файл, TxtInputStream
должен вести себя, как обычный FileInputStream.
•	Если в конструктор передан не txt-файл, должно быть 
выброшено исключение UnsupportedFileNameException.
•	В случае выброшенного исключения, так же должен быть
вызван super.close().
*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws FileNotFoundException, IOException, UnsupportedFileNameException {
        super(fileName);
        int i = fileName.lastIndexOf('.');
        String ext = null;
        if (i > 0 && i < fileName.length() - 1){
            ext = fileName.substring(i + 1).toLowerCase();
        }
        if(ext.equalsIgnoreCase("txt")){

        }else {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}
