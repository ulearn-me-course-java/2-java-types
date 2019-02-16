package com.example.task07;

public class Task07 {
    static int solution(int n, int m, int k) {
        return (n / k) * (m / k);
    }

    public static void main(String[] args) {
        int result = solution(1, 1, 1);
        System.out.println(result);
    }
}
