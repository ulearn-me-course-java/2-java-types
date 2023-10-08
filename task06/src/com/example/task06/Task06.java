package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int z = x + y;
        if (z == 0) return 1;
        int result = 0;
        while (z != 0) {
            z /= 10;
            ++result;
        }
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
