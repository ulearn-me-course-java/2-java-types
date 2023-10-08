package com.example.task02;

import java.io.Console;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long inputNumber = Long.parseLong(input);

        if(Integer.MIN_VALUE <= inputNumber && inputNumber <= Integer.MAX_VALUE){
            if(Short.MIN_VALUE <= inputNumber && inputNumber <= Short.MAX_VALUE){
                if(Byte.MIN_VALUE <= inputNumber && inputNumber <= Byte.MAX_VALUE){
                    return "byte";
                }
                return "short";
            }
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {

        String result = solution("100000");
        System.out.println(result);
    }
}
