package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int squareArea = n*m;
        int squareTent = k*k;
        return squareArea/squareTent;
    }

    public static void main(String[] args) {
        int result = solution(20, 20, 5);
        System.out.println(result);

    }

}
