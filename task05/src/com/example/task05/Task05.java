package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String result = "TRUE";
        while (x > 0) {
            int digit = x % 10;
            if (digit % 2 != 0) {
                return "FALSE";
            }
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
