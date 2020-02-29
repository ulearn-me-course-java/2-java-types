package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while(x > 0)
        {
            x = x % 10;
            return "x";
        }
        return "";
    }

    public static void main(String[] args) {

        String result = solution(1235);
        System.out.println(result);

    }

}
