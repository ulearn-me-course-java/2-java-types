package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);

        if (Byte.MAX_VALUE >= num && num >= Byte.MIN_VALUE) return "byte";
        else if (Short.MAX_VALUE >= num && num >= Short.MIN_VALUE) return "short";
        else if (Integer.MAX_VALUE >= num && num >= Integer.MIN_VALUE) return "int";
        else return "long";
    }

    public static void main(String[] args) {
    }

}
