package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x > 0)
        {
            int n = x % 10;
            if (n % 2 == 1) return "FALSE";
            x /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);
    }

}
