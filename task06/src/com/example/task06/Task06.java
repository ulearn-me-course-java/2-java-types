package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        String sumStr = Integer.toString(sum);
        return sumStr.length();
    }

    public static void main(String[] args) {
        int result = solution(9, 999);
        System.out.println(result);
    }

}
