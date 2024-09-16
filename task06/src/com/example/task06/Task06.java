package com.example.task06;

public class Task06 {
    public static int solution(int x, int y) {
        int number = x + y;
        return length(number);
    }

    public static int length(int number) {
        if (number == 0) {
            return 1;
        }

        int length = 0;
        while (number != 0) {
            number /= 10;
            length++;
        }

        return length;
    }
}
