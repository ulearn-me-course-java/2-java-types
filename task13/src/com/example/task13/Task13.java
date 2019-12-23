package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {



        return (char) ((int)c - 32);
    }

    public static void main(String[] args) {

        char result = toUpperCase('a');
        System.out.println(result);
    }

}