package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        for (int i = 0; i < String.valueOf(x).length(); i++) {
            if ((x / (int) Math.pow(10, i)) % 2 == 1)
                return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
