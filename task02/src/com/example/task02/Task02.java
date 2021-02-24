package com.example.task02;

import java.nio.charset.StandardCharsets;

public class Task02 {


    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long value = Long.parseLong(input);
        String result;

        if (value >= Byte.MIN_VALUE && value <= Byte.MAX_VALUE) {
            result = "byte";
        } else if (value >= Short.MIN_VALUE && value <= Short.MAX_VALUE) {
            result = "short";
        } else if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
            result = "int";
        } else {
            result = "long";
        }

        return result;
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);


        System.out.println();

    }

}