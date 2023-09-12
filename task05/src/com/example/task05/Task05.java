package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String str = Integer.toString(x);
        for (char symbol:str.toCharArray()) {

            if((symbol-'0')%2==1) return "FALSE";

        }
        return "TRUE";
    }

    public static void main(String[] args) {

    }

}
