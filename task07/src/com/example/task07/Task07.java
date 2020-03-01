package com.example.task07;

public class Task07 {

    public static int solution(int n, int m, int k) {
        int num1 = n / k;
        int num2 = m / k;
        int result = num1 * num2;
        return result;
    }

    public static void main(String[] args) {
        int result = solution(10, 20, 5);
        System.out.println(result);
    }

}
