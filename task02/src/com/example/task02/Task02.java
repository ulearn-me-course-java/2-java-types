package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        String type = "";

        try {
            Long.valueOf(input);
            type = "long";

            Integer.valueOf(input);
            type = "int";

            Short.valueOf(input);
            type = "short";

            Byte.valueOf(input);
            type = "byte";

        } catch (Exception ex) {}

        return type;
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
