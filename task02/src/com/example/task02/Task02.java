package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long inputNumber = Long.parseLong(input.trim());
        if ((byte) inputNumber == inputNumber) {
            return "byte";
        } else if ((short) inputNumber == inputNumber) {
            return "short";
        } else if ((int) inputNumber == inputNumber) {
            return "int";
        } else {
            return "long";
        }
    }

    public static void main(String[] args) {


        String result = solution("12345");
        System.out.println(result);
    }

}
