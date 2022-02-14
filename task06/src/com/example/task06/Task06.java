package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int counter = 0;
        int sum = Math.abs(x + y);

        if(sum == 0) return 1;

        while(sum > 0)
        {
            counter++;
            sum /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        int result = solution(51, 49);
        System.out.println(result);
    }

}
