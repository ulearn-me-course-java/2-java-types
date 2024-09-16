package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int v = n % k;
        int w = m % k;
        int newN = n - v;
        int newM = m - w;
        int result1 = newM / k;
        int result2 = newN / k;
        return result1 * result2;
    }

    public static void main(String[] args) {
        int result = solution(1000000, 1000000, 50);
        System.out.println(result);
    }

}
