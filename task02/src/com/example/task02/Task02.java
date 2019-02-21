package com.example.task02;

public class Task02 {
    private static long max = 0;

    public static String solution(String input) {
        try {
            max = Long.parseLong(input);
            if (max == (byte) max) return "byte";
            if (max == (short) max) return "short";
            if (max == (int) max) return "int";
            else return "long";

        }
        catch (Exception ex) {return "No Integral Type";}
    }

    public static void main(String[] args) {
        System.out.println(solution("9"));
        System.out.println(solution("E"));
        System.out.println(solution("string"));
    }

}