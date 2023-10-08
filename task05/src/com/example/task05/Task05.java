package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        String num = Integer.toString(x);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) % 2 != 0) {
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
