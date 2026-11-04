package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);

        if (number >= -128 && number <= 127) {
            return "byte";
        } else if (number >= -32_768 && number <= 32_767) {
            return "short";
        } else if (number >= -2_147_483_648 && number <= 2_147_483_647) {
            return "int";
        } else return "long";
    }

    public static void main(String[] args) {
        String result = solution("2147483648");
        System.out.println(result);
    }

}
