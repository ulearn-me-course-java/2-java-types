package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int k = 0;
        int sum = x + y;
        while (sum != 0){
            sum /= 10;
            k++;
        }

        return k;
    }

    public static void main(String[] args) {
        System.out.println(solution(653, 23));
    }

}
