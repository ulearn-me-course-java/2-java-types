package com.example.task08;

public class Task08 {

    public static boolean solution() {
        float x = 1e30f; // очень большое число
        return x == x + 1;
    }

    public static void main(String[] args) {
        System.out.println(solution());
    }

}
