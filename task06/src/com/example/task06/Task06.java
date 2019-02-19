package com.example.task06;

public class Task06 {

    static int solution(int x, int y) {
        return String.valueOf(Math.abs(y+x)).length();
    }

    public static void main(String[] args) {
        int result = solution(-11, -34);
        System.out.println(result);

    }

}
