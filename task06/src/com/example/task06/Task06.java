package com.example.task06;

public class Task06 {
    static int solution(int x, int y) {
        return String.valueOf(Math.abs(x + y)).length();
    }

    public static void main(String[] args) {
        int result = solution(-10, 10);
        System.out.println(result);
    }
}
