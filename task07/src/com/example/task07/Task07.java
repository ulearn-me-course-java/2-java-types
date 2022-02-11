package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        int countTents = 0;
        for(int i = 0; i < n / k * k; i += k){
            for(int j = 0; j < m / k * k; j += k){
                countTents++;
            }
        }
        return countTents;
    }

    public static void main(String[] args) {

        System.out.println(solution(1000000, 1000000, 50));
    }

}
