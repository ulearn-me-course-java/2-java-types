package com.example.task05;

public class Task05 {

    static String solution(int x) {
        boolean t = true;
        while (x != 0) {
            if ((x % 10) % 2 != 0)
                return "FALSE";
            x = x / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(8888);
        System.out.println(result);
    }

}
