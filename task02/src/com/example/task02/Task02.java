package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = (Long.parseLong(input));

        if (num != (int)num)
            return "long";
        else if (num != (short)num)
            return  "int";
        else  if (num != (byte)num)
            return  "short";
        else
            return "byte";
    }

    public static void main(String[] args) {

        String result = solution("-32768");
        System.out.println(result);

    }

}
