package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        if (x%2 == 0){
            return "TRUE";
        }
        else return "FALSE";
    }

    public static void main(String[] args) {
        String result = solution(99780);
        System.out.println(result);
    }

}
