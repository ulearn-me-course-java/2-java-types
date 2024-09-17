package com.example.task13;

import sun.nio.cs.UTF_8;

public class Task13 {

    public static char toUpperCase(char c) {
        return Character.toUpperCase(c);
    }

    public static void main(String[] args) {
        char result = toUpperCase('x');
        System.out.println(result);
    }

}
