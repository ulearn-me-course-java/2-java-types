package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {

        int summa = x + y;
        int counter = 0;
        if (summa == 0) return 1;
        while (summa != 0) {
            counter++;
            summa /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {

        int result = solution(10, 1);
        System.out.println(result);
    }

}
