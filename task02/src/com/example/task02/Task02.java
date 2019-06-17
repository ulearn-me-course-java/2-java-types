package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        Long number = Long.parseLong(input);
        String type = "long";

        if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) type = "byte";
        else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) type = "short";
        else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) type = "int";

        return type;
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
