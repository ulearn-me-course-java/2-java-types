package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {

        int s = c;
        s = s - 32;
        return (char) s;
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);

    }

}
