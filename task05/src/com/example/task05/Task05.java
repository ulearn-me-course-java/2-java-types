package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        return x%2==0 ? "TRUE" : "FALSE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
