package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;

        int absSum = Math.abs(sum);

        if (absSum == 0) {
            return 1;
        }

        int digits = 0;
        while (absSum > 0) {
            absSum /= 10;
            digits++;
        }
        return digits;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(12, 34);
        System.out.println(result);
        */
    }

}
