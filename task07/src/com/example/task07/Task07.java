package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int camp_width = n/k;
        int camp_height = m/k;
        return camp_height * camp_width;
    }

    public static void main(String[] args) {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }

}
