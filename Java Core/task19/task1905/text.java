package com.javarush.task.task19.task1905;

import java.nio.charset.Charset;

public class text {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("callto://+");
        String number = "+38(050)123-45-67";
        for(int i = 0; i < number.length(); i++){
            char w = number.charAt(i);
            if(( w >= '0') && (w <= '9')){
                builder.append(w);
            }
        }
        System.out.println(builder.toString());
    }
}
