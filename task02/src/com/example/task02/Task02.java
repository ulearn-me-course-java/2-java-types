package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            long value = Long.parseLong(input);

            if (value >= -128 && value <= 127) return "byte";
            if (value >= -32768 && value <= 32767) return "short";
            if (value >= -2147483648L && value <= 2147483647L) return "int";
            return "long";

        } catch (NumberFormatException e) {
            return "long";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
    }

}