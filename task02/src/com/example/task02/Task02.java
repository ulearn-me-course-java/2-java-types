package com.example.task02;


public class Task02 {

    // а что если input больше long?
    // К тестам можно добавить NumberFormatException (или оборачивать в BigInteger...но задание того не требует)
    static String solution(String input) {
        return solution(Long.parseLong(input));
    }

    static String solution(long input) {
        return isBetween(input, Byte.MAX_VALUE, Byte.MIN_VALUE) ? "byte" :
                isBetween(input, Short.MAX_VALUE, Short.MIN_VALUE) ? "short" :
                        isBetween(input, Integer.MAX_VALUE, Integer.MIN_VALUE) ? "int" : "long";
    }

    static boolean isBetween(long value, long from, long to) {
        return value <= from && value >= to;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("1000000000000000000000000000000000000000000000000000000005");
        System.out.println(result);
        */
    }
}
