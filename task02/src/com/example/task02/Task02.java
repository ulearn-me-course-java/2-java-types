package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long toLong = Long.parseLong(input);

        if(toLong == (byte) toLong) return "byte";

        if(toLong == (short) toLong) return "short";

        if(toLong == (int) toLong) return "int";

        return "long";
    }

    public static void main(String[] args) {
        System.out.println(solution("5"));
        System.out.println(solution("-35000"));
        System.out.println(solution("512"));
        System.out.println(solution("2500000000"));

    }

}