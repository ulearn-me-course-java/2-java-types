package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int hor = n / k;
        int ver = m / k;

        return hor*ver;
    }

    public static void main(String[] args) {
        System.out.println(solution(20,50,3));
    }

}
