package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        return x == 0 ? "TRUE" : x % 2 == 1 ? "FALSE" : solution(x / 10);
    }

    public static void main(String[] args) {
        String result = solution(4224);
        System.out.println(result);
    }

}
