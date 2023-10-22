package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        try {
            Byte.parseByte(input);
            return "byte";
        } catch (NumberFormatException e) {}

        try {
            Short.parseShort(input);
            return "short";
        } catch (NumberFormatException e) {}

        try {
            Integer.parseInt(input);
            return "int";
        } catch (NumberFormatException e) {}

        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("12345");
        System.out.println(result);
    }

}
