package com.example.task14;

public class Task14 {

    public static int reverse(int value) {
        int result = 0;
        while (value != 0) {
            result *= 10;
            result += value % 10;
            value /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = reverse(345);
        System.out.println(result);
    }

}
