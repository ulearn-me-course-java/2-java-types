package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        String result = "";
        long num = Long.parseLong(input);

        return num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE ? "byte" :
                num >= Short.MIN_VALUE && num <= Short.MAX_VALUE ? "short" :
                        num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE ? "int" :
                                "long";
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
