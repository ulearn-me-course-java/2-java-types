package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x > 0) {
            int digit = x % 10;
            x /= 10;

            if (digit % 2 != 0) {
                return "FALSE";
            }
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
