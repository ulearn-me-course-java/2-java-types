package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x+y, result = 0;
        do {
            sum /= 10;
            result++;
        }
        while (sum != 0);
        return result;
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
