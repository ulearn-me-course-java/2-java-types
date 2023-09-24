package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long inputNum = Long.parseLong(input);
        if(inputNum <= Byte.MAX_VALUE && inputNum >= Byte.MIN_VALUE)
            return "byte";
        else if(inputNum <= Short.MAX_VALUE && inputNum >= Short.MIN_VALUE)
            return "short";
        else if(inputNum <= Integer.MAX_VALUE && inputNum >= Integer.MIN_VALUE)
            return "int";
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
