package com.example.task02;

import java.util.Scanner;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        Long number = Long.parseLong(input);
        String result = " ";
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            result = "byte";
        } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            result = "short";
        } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            result = "int";;
        } else {
            result = "long";
        }

        return result;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
