package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int count = 0;

        if (sum == 0) {
            return 1;
        }

        sum = Math.abs(sum);
        while (sum > 0) {
            count++;
            sum /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
