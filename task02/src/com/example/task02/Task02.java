package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        if (Byte.MIN_VALUE <= input.length() && Byte.MAX_VALUE >= input.length()) return "byte";
        else if (Short.MIN_VALUE <= input.length() && Short.MAX_VALUE >= input.length()) return "short";
        else if (Integer.MIN_VALUE <= input.length() && Integer.MAX_VALUE >= input.length()) return "int";
        else return "long";

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
