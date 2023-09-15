package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long number = Long.parseLong(input);
        if(number>=-128&&number<=127) return "byte";
        else if (number>=-32768&&number<=32767) return "short";
        else if (number>=-2147483648&&number<=2147483647) return "int";
        else return "long";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("10020000345");
        System.out.println(result);
    }

}
