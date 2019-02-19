package com.example.task02;

public class Task02 {
    private static long max = 0;

    public static String solution(String input) {
        if (!tryParseLong(input))
            if (input.toCharArray().length == 1) return "char";
            else return "its no integral type";
        else {
            if (max == (byte) max) return "byte";
            if (max == (short) max) return "short";
            if (max == (int) max) return "int";
            else return "long";
        }
    }

    private static boolean tryParseLong(String value) {
        try {
            max = Long.parseLong(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("9"));
        System.out.println(solution("E"));
        System.out.println(solution("string"));
    }

}