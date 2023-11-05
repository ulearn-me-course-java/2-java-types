package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x > 0) {
            int digit = x % 10;
            if (digit % 2 != 0) {
                return "FALSE";
            }
            x /= 10;
        }

        return "TRUE";
    }

    public static int GetDigitsNum(int x) {
        int count = 0;
        if (x == 0) {
            return 1;
        } else {
            int num = Math.abs(x);
            while (num > 0) {
                count++;
                num /= 10;
            }
        }
        return count;
    }

    public static String alternativeSolution(int x) {
        int digitCount = GetDigitsNum(x);
        for (int i = 0; i < digitCount; i++) {
            int digit = x % 10;
            if (digit % 2 != 0) {
                return "FALSE";
            }
            x /= 10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {
        String result = alternativeSolution(25);
        System.out.println(result);
    }

}
