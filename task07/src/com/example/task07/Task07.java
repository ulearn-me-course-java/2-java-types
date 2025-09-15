package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        if (n == 0 || m == 0 || k == 0) return 0;
        if (n < 0 || m < 0 || k < 0) throw new IllegalArgumentException("Неверно набраны параметры!");
        return (n / k) * (m / k);
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int result = solution(10, 20, 5);
        System.out.println(result);
        */
    }

}
