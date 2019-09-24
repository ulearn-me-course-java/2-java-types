package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long n = Long.parseLong(input);
        if (n < Byte.MIN_VALUE || n > Byte.MAX_VALUE) {
            if (n < Short.MIN_VALUE || n > Short.MAX_VALUE) {
                if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                    return "long";
                return "int";
            }
            return "short";
        }
        return "byte";

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("-9223372036854775808");
        System.out.println(result);
    }

}
