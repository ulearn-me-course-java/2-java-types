package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        Long num = Long.parseLong(input);

        return Byte.MIN_VALUE <= num && num <= Byte.MAX_VALUE ? "byte"
                : Short.MIN_VALUE <= num && num <= Short.MAX_VALUE ? "short"
                : Integer.MIN_VALUE <= num && num <= Integer.MAX_VALUE ? "int"
                : "long";
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
