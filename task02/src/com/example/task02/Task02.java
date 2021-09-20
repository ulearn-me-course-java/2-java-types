package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long num = Long.parseLong(input);
        if ((num <= 127) && (num >= -128))
        {
            return "byte";
        }
        if (num <= 32767 && (num >= -32768))
        {
            return "short";
        }
        if (num <= 2147483647 && (num >= -2147483648))
        {
            return "int";
        }
        return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution("12345");
        System.out.println(result);
         */
        String result = solution("5");
        System.out.println(result);
    }

}
