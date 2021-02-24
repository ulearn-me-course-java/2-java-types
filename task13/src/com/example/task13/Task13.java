package com.example.task13;

public class Task13 {

    public static char toUpperCase(char c) {
        String str = Character.toString(c).toUpperCase();
        return str.toCharArray()[0];
    }

    public static void main(String[] args) {

        char result = toUpperCase('x');
        System.out.println(result);

    }

}
