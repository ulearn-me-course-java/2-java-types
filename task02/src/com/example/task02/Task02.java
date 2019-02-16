package com.example.task02;

public class Task02 {
    static String solution(String input) {
        long parseInput = Long.parseLong(input);
        if(parseInput == (byte)parseInput) return "byte";
        if(parseInput == (short)parseInput) return "short";
        if(parseInput == (int)parseInput) return "int";
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }
}
