package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputNumber = Long.parseLong(input);
        if (inputNumber <= Byte.MAX_VALUE &&  inputNumber >= Byte.MIN_VALUE) {
            return "byte";
        } else if (inputNumber <= Short.MAX_VALUE &&  inputNumber >= Short.MIN_VALUE) {
            return "short";
        } else if (inputNumber <= Integer.MAX_VALUE &&  inputNumber >= Integer.MIN_VALUE) {
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
