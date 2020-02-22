package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes e) {
       if(e == ImageTypes.BMP){
           ImageReader reader = new BmpReader();
           return reader;
       }else if(e == ImageTypes.JPG){
           ImageReader reader = new JpgReader();
           return reader;
       }else if(e == ImageTypes.PNG){
           ImageReader reader = new PngReader();
           return reader;
       }else
           throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
