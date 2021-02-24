package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long input1 = Long.parseLong(input);
        if (borderIs(7, input1)) //input1 >= -2^7 && input1 <= (2^7)-1
            return "byte";
        else if (borderIs(15, input1))
            return "short";
        else if (borderIs(31, input1))
            return "int";
        else return "long";
    }

    public static boolean borderIs(int powOfBorder, long value) {
        long border = (long) Math.pow(2, powOfBorder);
        return value >= -border && value <= border - 1;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
