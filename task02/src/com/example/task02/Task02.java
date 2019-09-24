package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long bigNumber = Long.parseLong(input);
        if (bigNumber>Integer.MAX_VALUE || bigNumber<Integer.MIN_VALUE) return "long";
        else if(bigNumber>Short.MAX_VALUE || bigNumber<Short.MIN_VALUE) return "int";
        else if (bigNumber>Byte.MAX_VALUE || bigNumber<Byte.MIN_VALUE) return "short";
        else return "byte";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("5");
        System.out.println(result);
    }

}
