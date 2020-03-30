package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        while (x>=0) {
            int y = (x % 10) % 2;
            if (y != 0) {
               break;
            }
            else if (x==0) {
                return "TRUE";
            }
            else x = x / 10;
        }

        return "FALSE";

    }

    public static void main(String[] args) {

        String result = solution(2344);
        System.out.println(result);

    }

}
