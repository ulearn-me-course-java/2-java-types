package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int result = x + y;
        return String.valueOf(Math.abs(result)).length();
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
