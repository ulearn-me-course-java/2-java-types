package com.example.task05;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Task05 {

    public static String solution(int x) {

        boolean flag = true;

        String stringValue = String.valueOf(x);

        for (int i = 0; i < stringValue.length(); i++){

            char c = stringValue.charAt(i);
            int digit = Character.getNumericValue(c);

            if (digit % 2 !=0){
                return "FALSE";
            }
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        String result = solution(1234);
        System.out.println(result);
        */
    }

}
