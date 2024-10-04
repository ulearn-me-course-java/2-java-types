package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int amount = x + y;
        if (amount == 0) {
            return 1;
        } else {
            int count = 0;
            while (amount != 0){
                count++;
                amount = amount / 10;
            }
            return count;
        }

    }

    public static void main(String[] args) {

        int result = solution(12, 34);
        System.out.println(result);
    }

}
