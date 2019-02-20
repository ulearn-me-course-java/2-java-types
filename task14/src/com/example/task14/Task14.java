package com.example.task14;

public class Task14 {
    public static int reverse(int value) {
        return Integer.parseInt(String.valueOf(new StringBuffer(Integer.toString(value)).reverse()));
    }

    public static void main(String[] args) {
        System.out.println(reverse(345));
    }
}