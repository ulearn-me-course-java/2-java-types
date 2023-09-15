package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        int value = Integer.parseInt(input);
        if (value < 128 && value >= -128) {
            return "Byte";
        } else if ((value >= -32768 && value < -128) || (value > 127 && value < 32768)) {
            return "Short";
        } else if ((value >= -2147483648 && value < -32768) || (value >= 32768 && value <= 2147483647)) {
            return "Int";
        } else {
            return "Long";
        }
    }

    public static void main(String[] args) {

        String result = solution("350000");
        System.out.println(result);

    }

}
