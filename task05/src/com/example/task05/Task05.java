package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x != 0) {
            if (x % 2 == 1)
                return "FALSE";
            x /= 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        System.out.println(solution(6791));

    }
}

