package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int temp = x;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                return "FALSE";
            }
            temp /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
