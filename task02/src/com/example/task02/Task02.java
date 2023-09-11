package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long ln = Long.parseLong(input);
        if(ln >= Byte.MIN_VALUE &  ln <= Byte.MAX_VALUE)
            return "byte";
        else if (ln >= Short.MIN_VALUE & ln <= Short.MAX_VALUE )
            return "short";
        else if (ln >= Integer.MIN_VALUE & ln <= Integer.MAX_VALUE )
            return "int";

        return "long";
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
