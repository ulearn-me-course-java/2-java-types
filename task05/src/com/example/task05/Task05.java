package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        while (x != 0) {
            if ((x % 10) % 2 != 0) {
                return "FALSE";
            }
                x /= 10;
        }
        return "TRUE";

    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        String result = solution(0);
        String result2 = solution(99999);
        String result3 = solution(4408);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }

}
