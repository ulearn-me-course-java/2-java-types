package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        long result = x + y;
        char[] digits = Long.toString(result).toCharArray();

        if(digits[0] == '-'){
            return digits.length - 1;
        }

        else{
            return digits.length;
        }
    }

    public static void main(String[] args) {

        solution(-111, -222);
    }

}
