package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        boolean res = true;

        while (x!=0) {
            if ((x % 10) % 2 != 0) {
                res = false;
                break;
            } else {
                res = true;
            }
            x /= 10;
        }
        if (res == true) {
            return "TRUE";
        } else {
            return "FALSE";
        }
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        String result = solution(2212);
        System.out.println(result);

    }

}
