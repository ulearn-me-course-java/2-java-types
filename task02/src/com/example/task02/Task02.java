package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long number = Long.parseLong(input.trim());

        if(number == (byte)number)
            return "byte";
        else if(number == (short)number)
            return "short";
        else if(number == (int)number)
            return "int";
        else
            return "long";

    }

    public static void main(String[] args) {
        System.out.println(solution("5"));
        System.out.println(solution("-35000"));
        System.out.println(solution("512"));
        System.out.println(solution("2500000000"));
    }

}
