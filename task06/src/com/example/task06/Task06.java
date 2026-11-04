package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int lineLength = String.valueOf(sum).length();

        if (sum < 0)
            lineLength -= 1;

        return lineLength;
    }

    public static void main(String[] args) {
        System.out.println(solution(12, 34));
        System.out.println(solution(625, 5324));
    }

}
