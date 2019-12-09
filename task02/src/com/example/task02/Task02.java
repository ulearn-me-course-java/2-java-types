package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long longInput = Long.parseLong(input);
        if (longInput >= Byte.MIN_VALUE && longInput <= Byte.MAX_VALUE) {
            return "byte";
        }
        else if (longInput >= Short.MIN_VALUE && longInput <= Short.MAX_VALUE) {
            return "short";
        }
        else if (longInput >= Integer.MIN_VALUE && longInput <= Integer.MAX_VALUE) {
            return "int";
        }
        else if (longInput >= Long.MIN_VALUE && longInput <= Long.MAX_VALUE ) {
            return "long";
        }
        return "Error";
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