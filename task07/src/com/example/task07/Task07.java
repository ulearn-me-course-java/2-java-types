package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

       int M = m / k;
       int N = n / k;

        return N * M;
    }

    public static void main(String[] args) {

        int result = solution(50, 20, 3);
        System.out.println(result);

    }

}
