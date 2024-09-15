package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k)
    {
        int side_1 = n / k;
        int side_2 = m / k;
        return side_1 * side_2;
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
