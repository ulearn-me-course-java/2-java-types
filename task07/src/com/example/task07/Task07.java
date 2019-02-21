package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int count = 0;
        int delta = m;
        if (k <= n && k <= m) {
            while (k <= n) {
                delta = m;
                while (k <= delta) {
                    count++;
                    delta = delta - k;
                }
                n = n - k;
            }
        }
        return count;
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
