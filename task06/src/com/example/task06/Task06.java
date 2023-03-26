package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int count = 0;
        if (sum == 0)
            return 1;
        while (sum != 0) {
            sum /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int result = solution(-11, -22);
        System.out.println(result);
    }

}
