package com.example.task02;

public class Task02 {

    public static String solution(String input) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей

         String type = "int";
        long impute = Long.parseLong(input);
        if(impute >= -128 && impute <= 127)
        {type = "byte";}
        else if(impute >= -32768 && impute <= 32767)
        {type = "short";}
        else if(impute >= -Math.pow(2, 31) && impute <= Math.pow(2, 31) - 1)
        {type = "int";}
        else if(impute >= -Math.pow(2, 63) && impute <= Math.pow(2, 63) - 1)
        {type = "long";}
        return type;
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
