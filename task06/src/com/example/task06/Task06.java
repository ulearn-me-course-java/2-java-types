package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = Math.abs(x + y);
        int count = 0;

        if (sum == 0) return 1;
        for (int i = 1; i <= sum; i *= 10) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
