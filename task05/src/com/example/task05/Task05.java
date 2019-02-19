package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        while (x % 2 == 0 && x != 0) { x /= 10; }
        if (x == 0)
            return "TRUE";
        else return "FALSE";
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
