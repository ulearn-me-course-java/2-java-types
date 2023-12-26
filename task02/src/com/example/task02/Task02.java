package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long result = Long.parseLong(input);
        if (result >= -128 & result <= 127){
            return "byte";
        }
        if (result >= -32768 & result <= 32767){
            return "short";
        }
        if (result >= -2147483648 & result <= 2147483647){
            return "int";
        }
        else {
            return "long";
        }

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution("12345");
        System.out.println(result);

    }

}
