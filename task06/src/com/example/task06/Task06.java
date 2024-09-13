package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        if (sum == 0) {
            return 1;
        } else {
            int k = 0;
            while (sum != 0) {
                sum /= 10;
                k++;
            }
            return k;
        }

    }

    public static void main(String[] args) {

        int result = solution(12333, 99999);
        System.out.println(result);

    }

}
