package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int k = 0;
        int number = x + y;
        if (number == 0)
            return 1;
        while (number != 0) {
            number /= 10;
            k++;
        }
        return;
    }

    public static void main(String[] args) {
        int result = solution(12, 34);
        System.out.println(result);
    }

}
