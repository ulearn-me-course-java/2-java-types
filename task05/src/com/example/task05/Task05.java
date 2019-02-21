package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        for (int i = 1; i <= 5; i++) {
            int digit = (x % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);
            if (digit % 2 != 0)
                return "FALSE";
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
