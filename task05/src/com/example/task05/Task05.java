package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        String stringNum = Integer.toString(x);

        for (int i = 0; i < stringNum.length(); i++){
            if((int)stringNum.charAt(i) % 2 != 0)
                return "FALSE";
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        System.out.println(solution(76234));
    }

}
