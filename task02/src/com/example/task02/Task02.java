package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long fromString = Long.parseLong(input);
        if ((fromString >= -128) && (fromString <= 127)) {
            return "byte";
        } else if ((fromString >= -32768) && (fromString <= 32767)) {
            return "short";
        } else if ((fromString >= -2147483648) && (fromString <= 2147483647)) {
            return "int";
        } else {
            return "long";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так
        //String result = solution("12345");
        //System.out.println(result);
    }

}
