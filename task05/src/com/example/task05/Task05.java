package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        int number = Math.abs(x);

        while (number > 0) {
            int digit = number % 10;

            if (digit % 2 != 0) {
                return "FALSE";
            }

            number /= 10;
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
