package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long fromString  = Long.parseLong(input);
        if(fromString < 128  && fromString >= -128)
            return "byte";
        else if (fromString <= 32767  && fromString >= -32768)
            return "short";
        else if (fromString <= 2147483647  && fromString >= -2147483648)
            return "int";
        else
            return "long";

    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }

}
