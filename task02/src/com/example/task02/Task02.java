package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        String result;
        long num = Long.parseLong(input);
        if(num >= -128 && num <= 127)
            result = "byte";
        else if(num >= -32768 && num <= 32767)
            result = "short";
        else if(num >=  -2147483648 && num <= 2147483647)
            result = "int";
        else
            result = "long";

        return result;
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
