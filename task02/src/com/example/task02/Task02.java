package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long x = Long.parseLong(input);
        if (-128 <= x && x <= 127)
        {
            return "byte";
        }
        if (-32768 <= x && x <= 32767)
        {
            return "short";
        }
        if (-2147483648 <= x && x <= 2147483647)
        {
            return "int";
        }
        if (-9223372036854775808l <= x && x <= 9223372036854775807l)
        {
            return "long";
        }
        return "exception";
    }

    public static void main(String[] args) {
        String result = solution("2500000000");
        System.out.println(result);
    }

}
