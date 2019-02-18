package com.example.task02;

public class Task02 {

    static String solution(String input) {

        long convertInput = Long.valueOf(input);
        if (convertInput == (byte)convertInput)
            return "byte";
        else if (convertInput == (short)convertInput)
            return "short";
        else if (convertInput == (int)convertInput)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);

    }
}

