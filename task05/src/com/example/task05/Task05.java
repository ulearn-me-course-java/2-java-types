package com.example.task05;

public class Task05 {
    public static String solution(int x) {
        int num1 = x % 10;
        int num2 = ((x - num1) / 10) % 10;
        int num3 = ((x - num1 - 10 * num2) / 100) % 10;
        int num4 = ((x - num1 - 10 * num2 - 100 * num3) / 1000) % 10;

        String answer = "FALSE";
        if (num1 % 2 == 0 && num2 % 2 == 0 && num3 % 2 == 0 && num4 % 2 == 0) answer = "TRUE";

        return answer;
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
