package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String result = "TRUE";
        while (x > 0) {
            if ((x % 10) % 2 != 0) {
                result = "FALSE";
            }
            x /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        String result = solution(222);
        System.out.println(result);
    }
}