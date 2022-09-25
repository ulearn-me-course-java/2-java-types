package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int chislo = x;
        while (chislo != 0) {
            if (chislo % 2 == 0) {
                chislo /= 10;
            } else {
                return "FALSE";
            }
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(1234);
        System.out.println(result);

    }

}
