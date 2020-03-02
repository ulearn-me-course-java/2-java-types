package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int num = x + y;
        int kol = 0;
        do {
            num /= 10;
            kol++;
        }
        while (num != 0);
        return kol;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int result = solution(12, 34);
        System.out.println(result);

    }

}
