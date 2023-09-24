package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int c = 0;
        int test = x;
        while (x > 0) {
            test = x % 10;
            if (test % 2 == 0) {
                x = x / 10;
                continue;
            }
            else {
                c = 1;
                break;
            }
        }
        if (c == 1) {
            return "FALSE";
        }
        else return "TRUE";
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
