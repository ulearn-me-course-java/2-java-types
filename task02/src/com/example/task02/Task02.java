package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long value = Long.valueOf(input);

        if(value > Integer.MAX_VALUE)return "long";
        if(value > Short.MAX_VALUE) return "int";
        if(value > Byte.MAX_VALUE) return "short";

        return  "byte";
    }

    public static void main(String[] args) {
        System.out.println(solution("12345"));
    }

}
