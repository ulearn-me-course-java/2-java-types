package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int verticalCount = n / k;
        int horizontalCount = m / k;
        return verticalCount * horizontalCount;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат

        int result = solution(10, 20, 5);
        System.out.println(result);

    }

}
