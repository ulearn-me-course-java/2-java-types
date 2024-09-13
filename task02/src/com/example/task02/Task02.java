package com.example.task02;

public class Task02 {
    public static String solution(String input) {
        long inputValue = Long.parseLong(input);
        if (inputValue >= Byte.MIN_VALUE && inputValue <= Byte.MAX_VALUE) {
            return "byte";
        } else if (inputValue >= Short.MIN_VALUE && inputValue <= Short.MAX_VALUE) {
            return "Short";
        } else if (inputValue >= Integer.MIN_VALUE && inputValue <= Integer.MAX_VALUE) {
            return "Integer";
        } else if (inputValue >= Long.MIN_VALUE && inputValue <= Long.MAX_VALUE) {
            return "Long";
        } else {
            return "Invalid number :(";
        }
    }

    public static void main(String[] args) {
        String result = solution("123");
        System.out.println(result);
    }

}
