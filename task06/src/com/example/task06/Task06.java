package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int sum = x + y;
        int length = Integer.toString(sum).length();
        if(sum >= 0){
            return length;
        }
        else {
            return length - 1;
        }
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
