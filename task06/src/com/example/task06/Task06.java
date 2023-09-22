package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int numberOfDigits = 0;

        while (sum != 0) {
            sum /= 10;
            numberOfDigits++;
        }
        if (numberOfDigits == 0)
            numberOfDigits++;
        return numberOfDigits;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
