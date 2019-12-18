package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long x = Long.valueOf(input);
        if (x < Byte.MAX_VALUE && x > Byte.MIN_VALUE){
            return "byte";
        } else if (x < Short.MAX_VALUE && x > Short.MIN_VALUE) {
            return "short";
        } else if (x < Integer.MAX_VALUE && x > Integer.MIN_VALUE) {
            return "int";
        } else {
            return "long";
        }

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);
    }

}
