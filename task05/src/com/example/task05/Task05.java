package com.example.task05;

import java.util.Arrays;

public class Task05 {

    public static String solution(int number) {
        String str = Integer.toString(number);
        char[] arr = str.toCharArray();
        for(int x : arr ) {
            if (x % 2 != 0) {
                return "FALSE";
            } else {
                continue;
            }
        }
        return "TRUE";

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(2254);
        System.out.println(result);

    }

}
