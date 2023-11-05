package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int sum = x + y;
        int answer = 0;
        if (sum == 0)
            return 1;
        while (sum != 0) {
            answer ++;
            sum /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        int result = solution(-11, -22);
        System.out.println(result);
    }

}
