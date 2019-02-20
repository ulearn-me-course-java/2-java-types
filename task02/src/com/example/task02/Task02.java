package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long lInput = Long.parseLong(input);
        if (lInput == (byte) lInput) return "byte";
        if (lInput == (short) lInput) return "short";
        if (lInput == (int) lInput) return "int";
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
