package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String result = "TRUE";

        while (x > 0) {
            int num = x % 10;
            if (num % 2 != 0){
                result = "FALSE";
                break;
            }
            x /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        String result = solution(4444);
        System.out.println(result);
    }
}
