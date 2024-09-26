package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long number = Long.parseLong(input);
        if(number <= 127 && number >= -128)
            return "byte";
        else if(number <= 32_767 && number >= -32_768)
            return "short";
        else if(number <= 2_147_483_647 && number >= -2_147_483_648)
            return "int";
        else if(number <= 9_223_372_036_854_775_807L && number >= -9_223_372_036_854_775_808L)
            return "long";
        return "NaN";
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
