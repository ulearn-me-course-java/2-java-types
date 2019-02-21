package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        for (int i = 0; i <= String.valueOf(x).length(); i++) {
            if ((x % 10) % 2 == 0) {
                x /= 10;
            } else return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {    }

}
