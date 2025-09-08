package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {


        String str = Integer.toString(Math.abs(x + y));
        int cnt = str.length();

        return cnt;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
