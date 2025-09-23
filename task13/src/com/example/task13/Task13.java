package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        char C =(char)(c - 32);
        return C;
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
