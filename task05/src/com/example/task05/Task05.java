package com.example.task05;

public class Task05 {

    public static String solution(int x) {

        for (int i = 0;i<5;i++){
            if ((x%10)%2==1){
                return "FALSE";
            }
            x/=10;
        }

        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(2288);
        System.out.println(result);

    }

}
