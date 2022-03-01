package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        boolean allAreEven = true;
        while (x != 0) {
            if (x % 2 != 0) {
                allAreEven = false;
                break;
            }
            x /= 10;
        }
        return allAreEven ? "TRUE" : "FALSE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }
}
