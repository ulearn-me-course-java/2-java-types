package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        int num = (int)c - 32;
        c = (char)num;
        return c;
    }

    public static void main(String[] args) {

        char result = toUpperCase('x');
        System.out.println(result);

    }

}
