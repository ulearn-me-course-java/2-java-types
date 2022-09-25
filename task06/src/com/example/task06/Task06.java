package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int summ = x+y;
        int k = 0;
        while (summ != 0) {
            summ = summ / 10;
            k++;
        }

        return k;
    }

    public static void main(String[] args) {

        int result = solution(1243234, 342342);
        System.out.println(result);

    }

}
