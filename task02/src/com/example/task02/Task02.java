package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        if ((Long.parseLong(input) > Integer.MAX_VALUE) || (Long.parseLong(input) < Integer.MIN_VALUE)) return "long";
        if (Integer.parseInt(input) > Short.MAX_VALUE || (Integer.parseInt(input) < Short.MIN_VALUE)) return "int";
        if (Short.parseShort(input) > Byte.MAX_VALUE || (Short.parseShort(input) < Byte.MIN_VALUE)) return "short";
        return "byte";
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
