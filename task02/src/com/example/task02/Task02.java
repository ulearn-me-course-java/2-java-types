package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            byte n = Byte.parseByte(input);
            return "byte";
        } catch (NumberFormatException e) {  }

        try {
            short n = Short.parseShort(input);
            return "short";
        } catch (NumberFormatException e) {  }

        try {
            int n = Integer.parseInt(input);
            return "int";
        } catch (NumberFormatException e) {  }

        try {
            long n = Long.parseLong(input);
            return "long";
        } catch (NumberFormatException e) {  }

        return "";
    }

    public static void main(String[] args) {
        String result = solution("12345");
        System.out.println(result);
    }

}
