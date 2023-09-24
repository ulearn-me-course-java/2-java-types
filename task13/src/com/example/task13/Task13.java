package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {
        char res = (char) (c - 32);
        return res;
    }

    public static void main(String[] args) {
        char result = toUpperCase('a');
        System.out.println(result);
    }

}
