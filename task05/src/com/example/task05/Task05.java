package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        boolean allEven = true;

        while (x != 0 && allEven) {
            if (x % 2 == 1) allEven = false;
            x /= 10;
        }

        return allEven ? "TRUE" : "FALSE";
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
