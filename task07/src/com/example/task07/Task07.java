package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int areaS = n * m;
        int tentS = k * k;
        return areaS/tentS;
    }

    public static void main(String[] args) {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }

}
