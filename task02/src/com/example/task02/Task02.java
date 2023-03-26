package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputNum = Long.parseLong(input);
        if (inputNum >= -128 && inputNum <= 127) return "byte";
        else if (inputNum >= -32768 && inputNum <= 32767) return "short";
        else if (inputNum >= -2147483648 && inputNum <= 2147483647) return "int";
        else return "long";
    }

    public static void main(String[] args) {
        String result = solution("abc");
        System.out.println(result);
    }

}
