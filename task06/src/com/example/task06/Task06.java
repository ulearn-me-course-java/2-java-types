package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int num = x + y;
        if (num == 0) return 1;
        int res = 0;
        while (num != 0) {
            res++;
            num /= 10;
        }
        return res;
    }
}
