package com.example.task06;

public class Task06 {
    public static int solution(int x, int y) {
        int sum = x + y;
        int counter = 0;
        do{
            counter++;
            sum = sum / 10;
        }while (sum != 0);
        return counter;
    }

    public static void main(String[] args) {
    }
}
