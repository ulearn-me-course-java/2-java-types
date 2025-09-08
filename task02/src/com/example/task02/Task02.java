package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        try {
            long num = Long.parseLong(input);
            if (-128 <= num && num <= 127) {
                return "byte";
            }
            else if (-32768 <= num && num <= 32767) {
                return "short";
            }
            else if (-2147483648 <= num && num <= 2147483647) {
                return "int";
            }
            else return "long";
        }
        catch (NumberFormatException e) {
            return "Неверный формат числа";
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
