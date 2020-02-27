package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int z = x + y;
        int i = 0;
        do {
            z = z / 10;
            i++;
        } while (z != 0);

        return i;
    }

    public static void main(String[] args) {
        int result = solution(99, 99);
        System.out.println(result);
    }

}
