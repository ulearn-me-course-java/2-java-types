package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        String result;

        if (isInRange(number, Byte.MIN_VALUE, Byte.MAX_VALUE)) result = "byte";
        else if (isInRange(number, Short.MIN_VALUE, Short.MAX_VALUE)) result = "short";
        else if (isInRange(number, Integer.MIN_VALUE, Integer.MAX_VALUE)) result = "int";
        else if (isInRange(number, Long.MIN_VALUE, Long.MAX_VALUE)) result = "long";
        else result = "error";

        return result;
    }

    public static boolean isInRange(long number, long min, long max) {
        return number >= min && number <= max;
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
