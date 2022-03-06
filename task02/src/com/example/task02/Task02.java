package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long var = Long.parseLong(input);
        if (var <= Byte.MAX_VALUE && var >= Byte.MIN_VALUE)
            return "byte";
        else if (var <= Short.MAX_VALUE && var >= Short.MIN_VALUE)
            return "short";
        else if (var <= Integer.MAX_VALUE && var >= Integer.MIN_VALUE)
            return "int";
        else
            return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution("127");
        System.out.println(result);


    }

}
