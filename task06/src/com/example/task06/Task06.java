package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        int counter = 0;

        if (sum == 0){
            counter = 1;
        }
        else {
            while (Math.abs(sum) > 0){
                counter ++;
                sum = sum / 10;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);

    }

}
