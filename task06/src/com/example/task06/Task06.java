package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int result = x+y;
        result = Math.abs(result);

        return Integer.toString(result).length();
    }

    public static void main(String[] args) {

    }

}
