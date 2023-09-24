package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        String sumAsString = Integer.toString(sum);
        if (sumAsString.contains("-")) {
            return sumAsString.split("-")[1].length();
        }
        return sumAsString.length();
    }

    public static void main(String[] args) {
        int result = solution(100, 900);
        System.out.println(result);
    }
}
