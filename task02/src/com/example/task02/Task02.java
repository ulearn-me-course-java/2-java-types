package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        long inputLong = Long.parseLong(input);
        if( inputLong >= Byte.MIN_VALUE && inputLong <= Byte.MAX_VALUE){
            return "byte";
        }
        else if(inputLong >= Short.MIN_VALUE && inputLong <= Short.MAX_VALUE){
            return "short";
        }
        else if(inputLong >= Integer.MIN_VALUE && inputLong <= Integer.MAX_VALUE){
            return "int";
        }
        else{
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
