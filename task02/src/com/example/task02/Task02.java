package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        long inputNum = Long.parseLong(input);

        if(inputNum > Integer.MAX_VALUE || inputNum < Integer.MIN_VALUE){
            return "long";
        }
        else if(inputNum > Short.MAX_VALUE || inputNum < Short.MIN_VALUE){
            return "int";
        }
        else if(inputNum > Byte.MAX_VALUE || inputNum < Byte.MIN_VALUE){
            return "short";
        }
        return "byte";
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
