package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        x += y;

        if (x < 0) {
            return String.valueOf(x).length() - 1;
        }

        return String.valueOf(x).length();
    }

    public static void main(String[] args) {

    }

}