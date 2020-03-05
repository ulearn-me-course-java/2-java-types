package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        Long inputNumber = Long.parseLong(input);
        String type = "long";
        if(inputNumber >= Byte.MIN_VALUE && inputNumber <= Byte.MAX_VALUE) type = "byte";
        else if(inputNumber >= Short.MIN_VALUE && inputNumber <= Short.MAX_VALUE) type = "short";
        else if(inputNumber >= Integer.MIN_VALUE && inputNumber <= Integer.MAX_VALUE) type = "int";
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
