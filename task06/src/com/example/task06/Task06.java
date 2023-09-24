package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sumNumbs = Math.abs(x + y);
        return String.valueOf(sumNumbs).length();
    }

    public static void main(String[] args) {

        int result = solution(-111, -222);
        System.out.println(result);

    }

}
