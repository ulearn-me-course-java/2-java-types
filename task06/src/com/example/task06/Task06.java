package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int num = Math.abs(x + y);
        int count = 1;
        while((num /= 10) > 0)
        {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);
    }

}
