package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        while (x % 2 == 0 && x != 0)
            x /= 10;

        return  x == 0 ? "TRUE" :  "FALSE";
    }

    public static void main(String[] args) {

        System.out.println(solution(1234));
    }
}
