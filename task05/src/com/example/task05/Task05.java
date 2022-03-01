package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        while (x != 0){
            int last = x % 10;
            if (last % 2 == 0) {
                x /= 10;
                solution(x);
            }
            else return "FALSE";
        }
        return "TRUE";
    }

    public static void main(String[] args) {
        String result = solution(84226);
        System.out.println(result);
    }

}
