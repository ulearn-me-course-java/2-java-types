package com.example.task05;

public class Task05 {

    public static String solution(int x) {
        for(int i = 0; i < x; i++){
            int num = x % 10;
            if(num % 2 != 0){
                return "FALSE";
            } else if (num == 0) {
                return "FALSE";
            }
            x = x / 10;
        }
        return "TRUE";
    }

    public static void main(String[] args) {

        String result = solution(10);
        System.out.println(result);

    }

}
