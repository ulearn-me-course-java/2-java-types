package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int result = 0;
        int sum = x + y;
        if(sum < 0) sum = -sum;
        if(sum == 0) return 1;
        while(sum > 0)
        {
            sum /= 10;
            result++;
        }
        return result;
    }


    public static void main(String[] args) {
        int result = solution(777, -776);
        System.out.println(result);
    }

}
