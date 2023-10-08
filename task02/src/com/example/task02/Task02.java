package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long fromString = Long.parseLong(input);
        if (fromString >= Byte.MIN_VALUE && fromString <= Byte.MAX_VALUE) return "byte";
        else if (fromString >= Short.MIN_VALUE && fromString <= Short.MAX_VALUE) return "short";
        else if (fromString >= Integer.MIN_VALUE && fromString <= Integer.MAX_VALUE) return "int";
        else if (fromString >= Long.MIN_VALUE && fromString <= Long.MAX_VALUE) return "long";
        return "error";
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
