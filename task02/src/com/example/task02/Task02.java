package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        String out = "";

        try {
            Long.valueOf(input);
            out = "long";

            Integer.valueOf(input);
            out = "int";

            Short.valueOf(input);
            out = "short";

            Byte.valueOf(input);
            out = "byte";
        } catch (Exception ignored) {

        }

        return out;
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
