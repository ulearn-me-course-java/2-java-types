package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long numb = Long.parseLong(input);
        if (numb <= Byte.MAX_VALUE && numb>= Byte.MIN_VALUE)
            return "byte";
        else if (numb <=Short.MAX_VALUE && numb >= Short.MIN_VALUE)
            return "short";
        else if (numb <= Integer.MAX_VALUE && numb >= Integer.MIN_VALUE)
            return "int";
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
