package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        double t = Double.parseDouble(input);
        if (t <= Byte.MAX_VALUE && t >= Byte.MIN_VALUE) return "byte";
        if (t <= Short.MAX_VALUE && t >= Short.MIN_VALUE) return "short";
        if (t <= Integer.MAX_VALUE && t >= Integer.MIN_VALUE) return "int";
        if (t <= Long.MAX_VALUE && t >= Long.MIN_VALUE) return "long";
        return "";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
