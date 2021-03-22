package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        double num = Double.parseDouble(input);
        if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
            return "byte";
        else if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
            return "short";
            else if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                return "int";
                else if ( num >= Long.MIN_VALUE && num <= Long.MAX_VALUE)
                    return "long";
        return "";
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
