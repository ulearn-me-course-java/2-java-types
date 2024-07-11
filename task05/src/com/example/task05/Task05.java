package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        for (int i = 0; i < String.valueOf(x).length(); i++) {
            if (getDigitOfNumber(x, i) % 2 == 1)
                return "FALSE";
        }
        return "TRUE";
    }

    public static int getDigitOfNumber(int number, int degree) {
        return (number / (int) Math.pow(10, degree)) % 10;
    }

    public static void main(String[] args) {
        String result = solution(224416);
        System.out.println(result);
    }

}
