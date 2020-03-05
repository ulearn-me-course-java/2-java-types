package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            Long.parseLong(input);
        } catch (Exception e) {
            throw new IllegalArgumentException();
        }

        try {
            Integer.parseInt(input);
        } catch (Exception e) {
            return "long";
        }

        try {
            Short.parseShort(input);
        } catch (Exception e) {
            return "int";
        }

        try {
            Byte.parseByte(input);
        } catch (Exception e) {
            return "short";
        }
        return "byte";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
