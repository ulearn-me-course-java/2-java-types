package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long convertInput = Long.valueOf(input);
        if(convertInput == (byte)convertInput) return "byte";
        if(convertInput == (short)convertInput) return "short";
        if(convertInput == (int)convertInput) return "int";
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
