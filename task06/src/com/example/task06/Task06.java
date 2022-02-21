package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        return getNumberLength(x + y);
    }

    public static int getNumberLength(int number) {
        int i = 1;
        while (number / 10 != 0) {
            number /= 10;
            i++;
        }
        return i;
    }

    public static void main(String[] args) {
        int result = solution(12, 987);
        System.out.println(result);
    }

}
