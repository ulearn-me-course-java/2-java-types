package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

        long num = Long.parseLong(input);

        if (Byte.MAX_VALUE >= num && Byte.MIN_VALUE <= num) {
            return "byte";
        } else if (Short.MAX_VALUE >= num && Short.MIN_VALUE <= num) {
            return "short";
        } else if (Integer.MAX_VALUE >= num && Integer.MIN_VALUE <= num) {
            return "int";
        } else {
            return "long";
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
