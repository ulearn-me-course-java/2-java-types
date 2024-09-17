package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {
        int result = (int)c - 32;
        return (char)result;
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
