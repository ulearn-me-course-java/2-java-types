package com.example.task09;

public class Task09 {

    public static double solution() {
        float a = 1.0F;
        float b = 3.0F;
        return (a / b - 1.0F / 3.0F) * 1.0e9;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
