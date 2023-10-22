package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        x += y;
        y = 0;
        while (x > 0)
        {
            x /= 10;
            y++;
        }
        return y;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}
