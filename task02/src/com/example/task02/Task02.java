package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long number = Long.parseLong(input);
        if(Byte.MIN_VALUE <= number && Byte.MAX_VALUE>=number)
            return "byte";
        else if(Short.MIN_VALUE <= number && Short.MAX_VALUE>=number)
            return "short";
        else if(Integer.MIN_VALUE <= number && Integer.MAX_VALUE>=number)
            return "int";
        else
            return "long";

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
