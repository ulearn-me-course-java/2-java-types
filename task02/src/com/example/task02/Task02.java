package com.example.task02;

public class Task02 {
    public static String solution(String input) {
        long number = Long.parseLong(input);
        if (-128 <= number && number <= 127) {
            return "byte";
        }
        if (-32768 <= number && number <= 32767) {
            return "short";
        }
        if (-2147483648 <= number && number <= 2147483647) {
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {

    }
}
