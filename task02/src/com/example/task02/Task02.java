package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long i = Long.parseLong (input);

        if(i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) {
            return "byte";
        }
        if(i >= Short.MIN_VALUE && i <= Short.MAX_VALUE) {
            return "short";
        }
        if(i >= Integer.MIN_VALUE && i <= Integer.MAX_VALUE) {
            return "int";
        }
        else return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
