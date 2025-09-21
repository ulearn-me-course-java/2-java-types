package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long longInput = Long.parseLong(input);

        if (Byte.MIN_VALUE <= longInput && longInput <= Byte.MAX_VALUE){
            return "byte";
        }

        if (Short.MIN_VALUE <= longInput && longInput <= Short.MAX_VALUE){
            return "short";
        }

        if (Integer.MIN_VALUE <= longInput && longInput <= Integer.MAX_VALUE){
            return "int";
        }

        else{
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
