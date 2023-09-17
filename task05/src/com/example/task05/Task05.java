package com.example.task05;
import java.io.*;

public class Task05 {

    public static String solution(int x) {
        String value = Integer.toString(x);
        for(int i = 0; i < value.length(); i++)
        {
            char[] array = value.toCharArray();
            if(Integer.parseInt(String.valueOf(array[i])) % 2 != 0){
                return "FALSE";
            }
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
