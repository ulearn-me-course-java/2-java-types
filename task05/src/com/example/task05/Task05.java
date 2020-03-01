package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        return String.valueOf(
                String.valueOf(x)
                        .chars()
                        // .map(ch -> Integer.parseInt(String.valueOf((char) ch)))
                        .allMatch(i -> i % 2 == 0)
        ).toUpperCase();
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }
}
