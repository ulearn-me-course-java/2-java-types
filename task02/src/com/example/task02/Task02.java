package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long inputNum;
        try {
            inputNum = Long.parseLong(input);
        } catch (NumberFormatException e) {
            return "Invalid number entered";
        }
        if (inputNum >= Byte.MIN_VALUE && inputNum <= Byte.MAX_VALUE ) {
            return "byte";
        } else if (inputNum >= Short.MIN_VALUE && inputNum <= Short.MAX_VALUE) {
            return "short";
        } else if (inputNum >= Integer.MIN_VALUE && inputNum <= Integer.MAX_VALUE) {
            return "int";
        } else if (inputNum >= Long.MIN_VALUE && inputNum <= Long.MAX_VALUE) {
            return "long";
        } else {
            return "Too high a number";
        }
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