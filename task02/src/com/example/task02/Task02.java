package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long digit;
        try {
            digit = Long.parseLong(input);
        } catch (Exception e) {
            return "Недопустимое значение";
        }

        if (digit <= Byte.MAX_VALUE && digit >= Byte.MIN_VALUE)
            return "byte";
        if (digit <= Short.MAX_VALUE && digit >= Short.MIN_VALUE)
            return "short";
        if (digit <= Integer.MAX_VALUE && digit >= Integer.MIN_VALUE)
            return "int";
        else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("Meow <3");
        System.out.println(result);
    }

}
