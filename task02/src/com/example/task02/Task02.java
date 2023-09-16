package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long num = Long.parseLong(input);
        if (num == (int) num) {
            if (num == (short) num) {
                if (num == (byte)num) {
                    return "byte";
                }
                else return "short";
            }
            else return "int";
        }
        else return "long";
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
