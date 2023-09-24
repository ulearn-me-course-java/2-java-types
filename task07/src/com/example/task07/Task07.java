package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int count1 = n/k;
        int count2 = m/k;
        return count1*count2;
    }

    public static void main(String[] args) {

        int result = solution(20, 50, 3);
        System.out.println(result);

    }

}
