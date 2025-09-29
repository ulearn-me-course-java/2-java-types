package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        String sumStr = String.valueOf(sum);
        int length = sumStr.length();

        return length;
    }

    public static void main(String[] args) {

        int result = solution(12, 3434);
        System.out.println(result);

    }

}
