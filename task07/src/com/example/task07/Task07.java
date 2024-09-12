package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {

        long vertical = (long)(n / k) * k;
        long horizontal = (long)(m / k) * k;
        int count = 0;

        count = (int) (vertical * horizontal / (k*k));

        return count;
    }

    public static void main(String[] args) {

        int result = solution(10, 20, 5);
        System.out.println(result);

    }

}
