package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (Byte.MAX_VALUE >= num && num >= Byte.MIN_VALUE)
            return "byte";
        if (Short.MAX_VALUE >= num && num >= Short.MIN_VALUE)
            return "short";
        if (Integer.MAX_VALUE >= num && num >= Integer.MIN_VALUE)
            return "int";
        if (Long.MAX_VALUE >= num && num >= Long.MIN_VALUE)
            return "long";
        return "";
    }

    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}
