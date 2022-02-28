package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        long resultSum = x + y;
        int countNumInResult = 0;
        do {
            countNumInResult++;
            resultSum /= 10;
        }
        while (resultSum != 0);
        return countNumInResult;
    }


    public static void main(String[] args) {
        int result = solution(12, 3455);
        System.out.println(result);
    }

}