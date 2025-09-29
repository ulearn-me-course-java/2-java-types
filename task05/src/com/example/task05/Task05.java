package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        int copyX = x;
        String result = "TRUE";

        while(copyX>0){
            int digit = copyX % 10;
            if(digit%2!=0){
                result = "FALSE";
                break;
            }
            copyX /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        String result = solution(1234);
        System.out.println(result);
    }

}
