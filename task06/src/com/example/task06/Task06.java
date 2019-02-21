package com.example.task06;

public class Task06 {

    public static int solution(int x, int y) {
        int z = 0;
        int temp = x + y;
        do
        {
            temp = temp/10;
            z += 1;
        }
        while(temp != 0);
        return z;
    }

    public static void main(String[] args) {
        int result = solution(777, -777);
    }

}
