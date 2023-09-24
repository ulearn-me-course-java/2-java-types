package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x+y;
        return Integer.toString(Math.abs(sum)).length();
    }

    public static void main(String[] args) {

        int result = solution(129, 349);
        System.out.println(result);
    }

}
