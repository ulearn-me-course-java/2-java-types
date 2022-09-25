package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        long result = x + y;
        int amount = 0;
        if (result == 0) return 1;
        while (result != 0)
        {
            result /= 10;
            amount += 1;
        }
        return amount;
    }

    public static void main(String[] args) {
        int result = solution(-111, -222);
        System.out.println(result);
    }

}
