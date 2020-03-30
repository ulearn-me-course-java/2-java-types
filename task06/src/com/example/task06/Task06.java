package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        x = x + y;
        y = 0;

        if (x==0) return ++y;
        while (x > 0 || x < 0){
            ++y;
            x /= 10;
        }
        return y;
    }

    public static void main(String[] args) {

        int result = solution(12, 36);
        System.out.println(result);
    }

}
