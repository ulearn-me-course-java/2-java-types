package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        // TODO напишите здесь свою корректную реализацию этого метода, вместо сеществующей
        int row = 0, result = 0, N = n, M = m;
        while (k <= N) {
            row++;
            N -= k;
        }
        while (k <= M) {
            result += row;
            M -= k;
        }
        return result;
    }

    public static void main(String[] args) {
        // Здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int result = solution(2, 10, 3);
        System.out.println(result);

    }

}
