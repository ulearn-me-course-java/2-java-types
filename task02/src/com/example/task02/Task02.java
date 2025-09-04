package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long solve = Long.parseLong(input);
        if (Byte.MIN_VALUE <= solve && solve <= Byte.MAX_VALUE) {
            return "byte";
        }

        else if (Short.MIN_VALUE <= solve && solve <= Short.MAX_VALUE) {
            return "short";
        }

        else if (Integer.MIN_VALUE <= solve && solve <= Integer.MAX_VALUE) {
            return "int";
        }

        else {
            return "long";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("12345");
        System.out.println(result);

    }

}
