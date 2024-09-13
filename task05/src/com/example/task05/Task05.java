package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int temp;
        while (x != 0) {
            temp = x % 10;
            if (temp % 2 != 0) {
                return "FALSE";
            }
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(204);
        System.out.println(result);

    }

}
