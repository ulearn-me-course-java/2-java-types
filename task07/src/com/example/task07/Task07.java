package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int squareK = n / k;
        int squareP = m / k;

        return squareK * squareP;
    }

    public static void main(String[] args) {

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
